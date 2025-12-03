package curriculam_B;

public class Question2 {
	
	public static void main(String[] args) {
	
		// Q1
		int score = 75;
		if (score >= 60) {
		
			System.out.println("合格です!");
		}
		
		// Q2
		int age = 25;
		if (30 >= age && age >= 20) {
			System.out.println("適正年齢です");
		} // ageの年齢が20以上30以下だった時
		else {
			System.out.println("対象外です");
		} // ageの年齢がそれ以外だった時
		
		// Q3
		int age3 = 18;
		if (age3 >= 20) {
			System.out.println("成人です");
		} // age3の年齢が20歳以上だった時
		else if (19 >= age3 && age3 >= 13) {
			System.out.println("ティーンエイジャーです");	
		} // age3の年齢が13歳以上19歳以下だった時
		else {
			System.out.println("子供です");
		} // age3の年齢が12歳以下だった時
		
		// Q4
		int x = 30;
		int y = 15;
		int z = 50;
		int max; // 最大値を入れる
		
		if (x >= y && x >= z) { // xがyとzよりも大きい時
			max = x;
		}
		
		else if (y >= x && y >= z) { // yがxとzよりも大きい時
			max = y;
		}
		
		else { // zがyとxよりも大きい時
			max = z;
		}
		System.out.println(max);
		
		// Q5
		int num = 0;
		
		if (num > 0) { // 正の数の時
			System.out.println("正の数です");
		}
		else if (num < 0) { // 負の数の時
			System.out.println("負の数です");
		}
		else { // 0の時
			System.out.println("0です");
		}
		
		// Q6
		int value = 1;
		
		if (value % 2 <= 0) { // 偶数の時
			System.out.println("偶数です");
		}
		else if (value % 2 != 0) { // 奇数の時
			System.out.println("奇数です");
		}
		
		// Q7
		int score7 = 50;
		
		if (score7 >= 90) { // 90以上の場合
			System.out.println("優");
		}
		else if (score7 >= 70) { // 70以上の場合
			System.out.println("良");
		}
		else if (score7 >= 50) { // 50以上の場合
			System.out.println("可");
		}
		else if (score7 < 50) { // 50以下の場合
			System.out.println("不可");
		}
		
		//Q8
		String text = "";
		
		if (text== null || text.isBlank()) { // 入力されてない場合
			System.out.println("入力が無効です");
		}
		else { // 入力されてる場合
			System.out.println(text);
		}
	}
}
