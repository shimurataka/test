package curriculam_1;

public class Question1 {

	public static void main(String[] args) {
		
		// Q1 初期値の設定
		Byte byteNum;
		Short shortNum;
		int intNum;
		long longNum;
		float floatNum;
		double doubleNum;
		char letter;
		String letters;
		boolean isBoolean;
		
		// Q2 変数の代入
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter  = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		// Q3
		
		// 10×1111する
		System.out.println(byteNum * 1111);
		// 100-80する
		System.out.println(shortNum - 80);
		// 文字を並べて間にスペースを入れりために""でスペースを入れる
		System.out.println(letter + " " + letters + " " + isBoolean);
		// doubleが含まれると小数点が出てしまうので出力する直前にlongにキャストする
		System.out.println((long)(byteNum + shortNum + intNum + longNum + floatNum + doubleNum));
		// longにした状態で先に掛け算をして後からフォーマット指定子で変更する
		long resultLong = (long)byteNum * shortNum * intNum * longNum;
		System.out.printf("%.0E\n",(double)resultLong);
		// 割り算をする
		System.out.println(doubleNum / shortNum);
		// 引き算をする
		System.out.println(byteNum - shortNum);
		
		// Q4
		// 変数と初期値を設定してテキストと一緒に出力
		String name = "山田太郎";
		
		System.out.println("こんにちは、" + name + "さん！");
		
		// Q5
		// 変数と初期値を設定してテキストと一緒に出力
		int age = 25;

		System.out.println("年齢:" + age + "歳");
		
		// Q6
		// 変数と初期値を設定して新しい変数内で足して出力
		int num1 = 10;
		int num2 = 5;
		int sum = (num1 + num2);
		
		System.out.println(sum);
		
		//Q7
		// 変数と初期値を設定してあとから20足してテキストと一緒に出力
		int score = 80;
		
		score +=20;
		
		System.out.println("最終スコア:" + score);
		
		// Q8
		// doubleの変数と初期値を設定して変数をintに変換してテキストと一緒に出力
		double price = 99.99;

		int convertedint = (int)price;
		
		System.out.println("整数価格:" + convertedint);
		
		// Q9
		// Stringの変数と初期値を設定してStringをintに変換して10を足して出力
		String numStr = "123";
		
		int intNumber = Integer.parseInt(numStr);
		
		System.out.println(intNumber + 10);
		
		// Q10
		// int変数と初期値を設定してintをStringに変換してテキストと一緒に出力
		int num = 50;
		
		String strNumber = String.valueOf(num);
		
		System.out.println("得点:" + strNumber + "点");
		
		// Q11
		// 変数と初期値を設定してaがbより小さいかを代入して結果を出力
		int a =10;
		int b = 20;
		boolean result = a < b;
		
		System.out.println(result);
		
		// Q12
		// 変数と初期値を設定して10以上か比べて結果を出力
		int x = 15;
		
		String resultx = (x >= 10) ? "OK" : "NG";
		
		System.out.println(resultx);
		
		// Q13
		String text = "私はJavaが好きです。Javaは楽しい！";
		
		
	}
}
