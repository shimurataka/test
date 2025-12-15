package curriculum.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main { // 勝つまで繰り返すたのMain
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rsp player = new Rsp(); // じゃんけん用のインスタンス
		
		int result = -1; // 初期状態
		
		System.out.println("じゃんけんゲームを開始します。勝つまで続けます。");
		System.out.println("グー(0)、チョキ(1)、パー(2)を入力してください。");
		
		while (result != 1) { // 勝つまで繰り返す
			int playerHand = -1;
			int cpuHand = player.getCpuHand();
			
			try { // 入力された数字のチェック
				System.out.print("\nあなたの手(0,1,2,) :");
				if (scanner.hasNextInt()) { // 入力チェック
					playerHand = scanner.nextInt();
				} else { // 整数以外の場合はスキップ＆再入力
					System.out.println("エラー: 整数(0,1,2)で入力してください。");
					scanner.next(); // 入力を無視する
					continue; // ループの先頭に戻る
				}
				
				if (playerHand < 0 || playerHand > 2) {
					System.out.println("エラー: 0,1,2のいずれかを入力してください。");
					continue; // ループの先頭に戻る
				}
				
				// 入力された手とCPUの手を出力する
				System.out.println("あなたの手: " + player.handToString(playerHand));
				System.out.println("CPUの手" + player.handToString(cpuHand));
				
				result = player.judge(playerHand, cpuHand); // 勝敗チェック
				
				if (result == 1) { 
					System.out.println("あなたの勝ち！");
				} else if (result == 0) {
					System.out.println("あいこで...");
				} else {
					System.out.println("あなたの負け！");
				}
			}catch (InputMismatchException e) {
				// ここは"scanner.hasNextInt()"で防いでいるため、通常は到達しない
				System.out.println("エラー: 無効な入力です。整数で入力してください。");
				scanner.next(); // 入力を無視する
				result = -1; // 負け判定する
			}
		}
		
		scanner.close();
		System.out.println("終了します。");
	}
}
