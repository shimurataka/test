package curriculum.d;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	private static final String LOG_FILE = "battle_log.txt";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("あなたの名前を入力してください: ");
		String playerName = scanner.nextLine();

		int p_hp = random.nextInt(41) + 80;
		int p_at = random.nextInt(6) + 10;
		int p_sp = random.nextInt(6) + 5;

		Character player = new Character(playerName, p_hp, p_at, p_sp);

		Character daemon = Character.loadDaemon("daemon_status.txt");

		System.out.println("Player: " + player);
		System.out.println("Daemon: " + daemon);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOG_FILE, false))) {
			bw.write("--- バトルログ ---");
			bw.newLine();
			bw.write("Player: " + player.getName() + " 初期ステータス: HP " + player.getHp() + " AT " + player.getAt() + " SP "
					+ player.getSp());
			bw.newLine();
			bw.write("Daemon: " + daemon.getName() + " 初期ステータス: HP " + daemon.getHp() + " AT " + daemon.getAt() + " SP "
					+ daemon.getSp());
			bw.newLine();

			// 先行、後攻
			Character firstAttacker;
			Character secondAttacker;

			if (player.getSp() > daemon.getSp()) {
				firstAttacker = player;
				secondAttacker = daemon;
			} else if (daemon.getSp() > player.getSp()) {
				firstAttacker = daemon;
				secondAttacker = player;
			} else { // 同速
				if (random.nextBoolean()) {
					firstAttacker = player;
					secondAttacker = daemon;
				} else {
					firstAttacker = daemon;
					secondAttacker = player;
				}
			}

			String startMsg = firstAttacker.getName() + " の先攻です！";
			System.out.println(startMsg);
			bw.write(startMsg);
			bw.newLine();

			int turn = 1; // バトルループ
			while (player.getHp() > 0 && daemon.getHp() > 0) {
				String turnHeader = String.format("\n--- ターン %d ---", turn);
				System.out.println(turnHeader);
				bw.write(turnHeader);
				bw.newLine();

				// 攻撃
				performAttack(firstAttacker, secondAttacker, bw);
				if (secondAttacker.getHp() <= 0) break; // バトル終了

				// 反撃
				performAttack(secondAttacker, firstAttacker, bw);
				if (firstAttacker.getHp() <= 0) break; // バトル終了

				// ターン終了時に攻撃順序を入れ替える
				Character temp = firstAttacker;
				firstAttacker = secondAttacker;
				secondAttacker = temp;

				turn++;
			}
			
			// ★★★ 結果出力とログ書き込みは try ブロック内で行う ★★★
			String resultMsg;
			if (player.getHp() <= 0 && daemon.getHp() <= 0) {
				resultMsg = "相打ち！引き分けです。";
			} else if (player.getHp() <= 0) {
				resultMsg = player.getName() + " は倒れた。Daemon　の勝利！";
			} else {
				resultMsg = "Daemon は倒れた。" + player.getName() + " の勝利！";
			}

			System.out.println("\n" + resultMsg);
			bw.write("\n" + resultMsg);
			bw.newLine();

			System.out.println("最終ステータス:");
			System.out.println("Player: " + player.getName() + " HP" + player.getHp());
			System.out.println("Daemon: " + daemon.getName() + " HP" + daemon.getHp());

			bw.write("最終ステータス: Player HP: " + player.getHp() + ", Daemon HP: " + daemon.getHp());

			System.out.println("\nバトルの結果は " + LOG_FILE + " に記録されました。");

		} catch (IOException e) { // ★ catch は try の直後
			System.out.println("エラー: バトルログの書き込み中にエラーが発生しました。");
			e.printStackTrace();
		} finally {
			// ★ Scanner のクローズ ★
			scanner.close();
		}
	}

	/**
	 * 攻撃処理を実行するヘルパーメゾット
	 * * @param attacker 攻撃する側
	 * @param defender 攻撃される側
	 * @param bw バトルログ書き込み用のBufferedWriter
	 * @throws IOException ファイル書き込みエラー
	 */
	private static void performAttack (Character attacker,Character defender, BufferedWriter bw) throws IOException {
		if (attacker.getHp() <= 0 || defender.getHp() <= 0) return;
		
		int damage = attacker.getAt();
		defender.damage(damage);
		
		String msg = String.format(
				"%s の攻撃！ %s に %d のダメージ！(%s HP: %d)",
				attacker.getName(), defender.getName(), damage, defender.getName(), defender.getHp());
				System.out.println(msg);
		bw.write(msg);
		bw.newLine();
	}
}