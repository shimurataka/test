package curriculam_B;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {

		// Q1
		int[] numbers = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(numbers)); // 変数に入れたをそのまま出力

		// Q2
		Integer[] numbers2 = { 10, 20, 30, 40, 50 };
		Arrays.sort(numbers2, Collections.reverseOrder()); // 変数に入れたものをひっくり返して出力
		System.out.println(Arrays.toString(numbers2));

		// Q3
		int[] numbers3 = { 3, 5, 7, 9, 11 };
		int sum = 0; // numbers3を順番に足して入れていく変数
		for (int numbera : numbers3) { // 足していく
			sum += numbera;
		}

		System.out.println(sum);

		// Q4
		int[] numbers4 = { 12, 7, 9, 21, 5, 18 };
		int nummax = numbers4[0]; // 最大値を入れる
		int nummin = numbers4[0]; // 最小値を入れる

		for (int numberb : numbers4) { // numberbに入ってる数とどちらが小さいか比べて小さいほうを出力する
			if (numberb < nummin) {
				nummin = numberb;
			}
			if (numberb > nummax) { // numberbに入ってる数とどちらが大きいか比べて大きいほうを出力する
				nummax = numberb;
			}
		}

		System.out.println("最大値" + nummax);
		System.out.println("最小値" + nummin);

		// Q5
		int[] numbers5 = { 1, 2, 3, 4, 5 };
		int[] doubledNumbers = new int[numbers5.length]; // 変更後を入れる配列
		int index = 0; // doubledNumberに入れるための変数
		for (int numberc : numbers5) {
			doubledNumbers[index] = numberc * 2; // 計算結果をindex使って新しい配列に入れる
			index++;
		}

		System.out.println(Arrays.toString(doubledNumbers));

		// Q6
		int[] numbers6 = { 4, 7, 10, 15, 20 };

		Scanner scanner = new Scanner(System.in); // 入力

		int targetNumber = scanner.nextInt();

		boolean found = false;

		for (int numberd : numbers6) {
			if (numberd == targetNumber) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(targetNumber + "は配列に含まれます");
		} else {
			System.out.println(targetNumber + "は配列に含まれません");
		}

		// Q7
		int[][] array7 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int i = 0; i < array7.length; i++) { // i行を一つずつ
			for (int j = 0; j < array7[i].length; j++) { // i行のjを一つずつ
				System.out.print(array7[i][j] + " ");
			}
			System.out.println(); // 行が終わったら改行
		}

		// Q8
		int[][] array8 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int sum8 = 0;

		for (int i = 0; i < array8.length; i++) { // i行を一つずつ
			for (int j = 0; j < array8[i].length; j++) { // i行のjを一つずつ
				sum8 += array8[i][j];
			}
		}
		System.out.println(sum8);

		// Q9
		int[][] array9 = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };
		int nummax9 = array9[0][0]; // 最大値を入れる
		int nummin9 = array9[0][0]; // 最小値を入れる

		for (int i = 0; i < array9.length; i++) { // i行を一つずつ
			for (int j = 0; j < array9[i].length; j++) { // i行のjを一つずつ
				int numbere = array9[i][j]; // numbereに入ってる数とどちらが小さいか比べて小さいほうを出力する
				if (numbere < nummin9) {
					nummin9 = numbere;
				}
				if (numbere > nummax9) { // numbereに入ってる数とどちらが大きいか比べて大きいほうを出力する
					nummax9 = numbere;
				}

			}
		}
		System.out.println("最大値" + nummax9);
		System.out.println("最小値" + nummin9);

		// Q10
		int[][][] array10 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		for (int i = 0; i < array10.length; i++) {

			System.out.println("シート" + (i + 1));

			for (int j = 0; j < array10[i].length; j++) { // j行を一つずつ

				for (int k = 0; k < array10[i][j].length; k++) { // j行のkを一つずつ
					System.out.print(array10[i][j][k] + " ");
				}

				System.out.println(); // 行が終わったら改行
			}

			System.out.println(); // シートが終わったら切り替える
		}

		scanner.close(); // Scannerを閉じる

	}
}
