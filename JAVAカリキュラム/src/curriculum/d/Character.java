package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 共通のステータス情報
 */
public class Character {
	private String name;
	private int hp; // 体力
	private int at; // 攻撃
	private int sp; // 素早さ
	
	public Character(String name, int hp, int at, int sp) { // コンストラクタ
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	
	public Character () { 
		this.name = "Unknown";
		this.hp = 0;
		this.at = 0;
		this.sp = 0;
	}
	
	public String getName() { return name; } // gettter
	public int getHp() { return hp; }
	public int getAt() { return hp; }
	public int getSp() { return hp; }
	
	public void damage(int amount) { // HPメゾット
		this.hp -= amount;
		if (this.hp < 0) {
			this.hp = 0;
		}
	}
	
	/*テキストファイルを読み取るメゾット
	 * 
	 * @param fileName ("daemon_status.txt")
	 * @return 読み込んだデータで初期化されたCharacterインスタンス
	 */
	public static Character loadDaemon(String fileName) {
		try (BufferedReader bReader = new BufferedReader(new FileReader(fileName))) {
			String name = br.readLine();
			int hp = Integer.parseInt(br.readLine());
			int at = Integer.parseInt(br.readLine());
			int sp = Integer.parseInt(br.readLine());
			
			System.out.println("DEBUG: Daemonステータスを読み込みました: " + name + " HP:" + hp + " AT:" + at + " SP:" + sp);
			return new Character(name, hp, at, sp);
		} catch (IOException | NumberFormatException e) {
			System.out.println("エラー: Daemonステータスファイルの読み込み中にエラーが発生しました。");
			e.printStackTrace();
			return new Character("DefaultDaemon", 50, 5, 3); // 読み込み失敗時はdaemonを返す
		}
	}
	
	@Override
	public String toString() {
		return name + "(HP:" + hp + ", AT:" + at + ", SP:" + sp + ")";
	}
}
