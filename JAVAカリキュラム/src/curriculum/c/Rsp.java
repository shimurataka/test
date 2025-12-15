package curriculum.c;

import java.util.Random;

public class Rsp {
	public static final int ROCK = 0;
	public static final int SCISSORS = 1;
	public static final int PAPER = 2;
	
	private static final Random random = new Random();
	
	/*
	 * ランダムに出すようにする
	 * @return 0,1,2のどれか
	 */
	
	public int getCpuHand() {
		return random.nextInt(3); // 0,1,2のどれかを返す
	}
	
	/*
	 * 数値をじゃんけんの手に変換する
	 * @param hand 手
	 * @return 日本語に変換
	 */
	
	public String handToString(int hand) {
		switch (hand) {
		case ROCK:
			return "グー";
		case SCISSORS:
			return "チョキ";
		case PAPER:
			return "パー";
		default:
			return "不明な手";
		}
	}
	
	/*
	 * 互いの手を判定して勝敗をつける
	 * 
	 * @param playerHand 0:グー 1: チョッキ 2: パー
	 * @param cpuHand 0:グー 1: チョッキ 2: パー
	 * @return -1(負け), 0(あいこ), 1(勝ち)
	 */
	
	public int judge(int playerHand, int cpuHand) {
		if (playerHand == cpuHand) {
			return 0; // あいこ
		}
		if ((playerHand == ROCK && cpuHand == SCISSORS) || // 勝つ条件
			(playerHand == SCISSORS && cpuHand == PAPER) ||
			(playerHand == PAPER && cpuHand == ROCK)) {
			return 1; // 勝ち
		} else {
			return -1; // 負け
		}
	}
}
