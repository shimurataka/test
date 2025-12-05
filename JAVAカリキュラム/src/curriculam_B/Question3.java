package curriculam_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		// Q1
		for (int i = 1; i <= 10; i++) { // 10まで1ずつ増やす

			System.out.println(i);
		}

		//  Q2
		for (int i2 = 2; i2 <= 20; i2++) { // 20まで1ずつ増やす
			if (i2 % 2 != 0) { // 奇数をスキップ
				continue;
			} 
			System.out.println(i2);
		}

		// Q3
		for (int i3 = 10; i3 >= 1; i3--) { // 10まで1ずつ減らす
			System.out.println(i3);
		}

		// Q4
		int sum = 0; // 合計を入れる変数を作る
		for (int i4 = 1; i4 <= 100; i4++) { // 1ずつカウントを増やす
			sum += i4; // 前に作った変数にカウントしたものを入れて出力する
		}

		System.out.println(sum);

		// Q5
		String dots = ""; // .を入れる変数を作る

		for (int i5 = 1; i5 <= 5; i5++) { // 5までカウントする
			dots += "."; // .を入れる

			System.out.println(dots);
		}

		// Q6
		int i6 = 0; // i6の初期値を設定
		while (i6 <= 10) { // 上限10までにする
			System.out.println(i6);
			i6++; // 1ずつ増やす
		}

		// Q7
		int i7 = 1; // i7の初期値を設定
		do {
			i7++;
			if (i7 % 2 != 0) {
				continue;
			}
			System.out.println(i7); // 1ずつ増やす
		} while (i7 <= 20); // 20まで

		// Q8
		int i8 = 10; // 初期値を10に設定
		while (i8 >= 1) { // 1まで
			System.out.println(i8);
			i8--; // 1ずつ引く
		}

		// Q9
		int i9 = 1; // i9の初期値を設定
		int sum2 = 0; // 空の変数を作る
		while (i9 <= 100) { // 空の変数に1ずつ増やしたものを足していく
			sum2 += i9;
			i9++;
		}
		System.out.println(sum2);

		// Q10
		Scanner scanner = new Scanner(System.in); // スキャナーを作る
		int inpnum;
		
		while (true) { // ループさせる
			System.out.println("入力");
			
			if (scanner.hasNextInt()) { // 数字かどうか読み込む
				inpnum = scanner.nextInt(); // 入力さてた数字を読み取る
				scanner.nextLine(); // 改行する
				
				if (inpnum == 0) { // 0が入力されたら表示する
					System.out.println("終了します");
					break;
				}
				
			}
			
		}
 

		// Q11
		for (int i11x = 1; i11x <= 9; i11x++) { // X軸を初期値、上限、1ずつ増やす

			for (int i11y = 1; i11y <= 9; i11y++) { // Y軸を初期値、上限、1ずつ増やす
				int result = i11x * i11y;

				System.out.printf("%02d*%02d=%02d", i11x, i11y, result); // 

				if (i11y < 9) {
					System.out.print(" || ");
				}
			}

			System.out.println();

		}

		// Q12

		final String[] ALL_PRODUCTS = { // 全体の商品リスト
				"パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器",
				"テレビ", "ディスプレイ", "その他の商品"
		};

		Random rand = new Random();
		final int TV_DISPLAY_TOTAL = 11;

		int tvStock = rand.nextInt(TV_DISPLAY_TOTAL + 1); // テレビとディスプレイの在庫は最初に決定しておく
		int displayStock = TV_DISPLAY_TOTAL - tvStock;

		System.out.println("表示したい商品名を「,」（カンマ）または「、」（読点）で区切って入力してください。");

		String inputLine = scanner.nextLine();

		String[] productsToDisplay = inputLine.split("[,、]"); // 入力文字列を「,」または「、」で分割

		System.out.println("\n--- 指定された商品の在庫状況 ---");

		for (String productWithTrim : productsToDisplay) {

			// 前後の空白を削除
			String product = productWithTrim.trim();

			int remainingStock;
			String outputText = "";
			boolean isKnownProduct = false; // 指定の商品かどうかをチェックするフラグ

			switch (product) { // 共通在庫数と出力の決定
			case "テレビ":
				remainingStock = tvStock;
				outputText = product + "の残り台数は" + remainingStock + "台です";
				isKnownProduct = true;
				break;

			case "ディスプレイ":
				remainingStock = displayStock;
				outputText = product + "の残り台数は" + remainingStock + "台です";
				isKnownProduct = true;
				break;

			case "その他の商品":
				outputText = "『" + product + "』は指定の商品ではありません";
				isKnownProduct = true;
				break;

			case "パソコン": // （その他の5商品）
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				
				remainingStock = rand.nextInt(TV_DISPLAY_TOTAL + 1); // 0〜11のランダムな値を設定
				outputText = product + "の残り台数は" + remainingStock + "台です";
				isKnownProduct = true;
				break;

			default:
				outputText = "『" + product + "』は指定の商品ではありません"; // 定義されていない商品が入力された場合
				isKnownProduct = false;
				break;
			}

			System.out.println(outputText);
		}
		
		scanner.close(); // Scannerを閉じる
		
	}

}
