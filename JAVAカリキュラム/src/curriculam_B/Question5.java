package curriculam_B;

public class Question5 {
	// Q1
	public static void hello() {
		System.out.println("Hello,World!");
	}

	// Q2
	public static int doubleValue(int num) { // 引数を設定する
		return num * 2; // 2倍にする
	}

	// Q3
	public static boolean isEven(int num) {
		return num % 2 == 0; // 余りが0かを使ってtrueかfalseかを見る
	}

	// Q4
	public static class Greeting { // 新しいclassを作って出力結果を入れる
		public void sayhello() {
			System.out.println("こんにちは！");
		}
	}
	
	// Q5
	public static class Animal { // classの追加
		private String name;
		private double length; // フィールドの定義
		private int speed;
		
		public void setName(String name) {
			this.name = name; // thisに引数の値を設定
		}
		public void setLength(double length) {
			this.length = length;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		public String getName() {
			return this.name; // フィールドの値を戻す
		}
		public double getLength() {
			return this.length;
		}
		public int getSpeed() {
			return this.speed;
		}
	}
	
	// 以下main
	public static void main(String[] args) {
		// Q1
		hello();
		
		// Q2
		int value = 10; // 元の10を入れる
		int doubleValue = doubleValue(value); // 2倍にして持ってくる
		System.out.println(value + "を2倍すると" + doubleValue + "です。");
		
		// Q3
		int num1 = 7;
		int num2 = 10;
		
		if (isEven(num1)) { 
			System.out.println(num1 + "は偶数です。"); // true
		} else {
			System.out.println(num1 + "は奇数です。"); // false
		}
		
		if (isEven(num2)) {
			System.out.println(num2 + "は偶数です。"); // true
		} else {
			System.out.println(num2 + "は奇数です。"); // false
		}
		
		//  Q4
		Greeting greeting = new Greeting(); // 作ったクラスに変数を入れてそれを実行する
		greeting.sayhello();
		
		// Q5
		Animal lion = new Animal(); // 新しいクラスのインスタンスを作る
		
		lion.setName("ライオン"); // setterを使って変数の中身を設定する
		lion.setLength(2.1);
		lion.setSpeed(80);
		
		System.out.println("動物名:" + lion.getName()); // getterを使って値を取得して出力
		System.out.println("体長:" + lion.getSpeed() + "m");
		System.out.println("速度:" + lion.getSpeed() + "km/h");
	}
	
}
