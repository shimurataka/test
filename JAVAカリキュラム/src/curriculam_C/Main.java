package curriculam_C;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("山田太郎", 20, 1.7, 60); // 問５weightの引数60を入れる

		person1.print(); // 問9のprintを呼び出す
		System.out.println("合計" + Person.count + "人です"); // 問10 countを出力
	}
}
