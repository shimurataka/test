package curriculam_C;

public class Person { // 問1 フィールド
	public String name;
	public int age;
	public double height;
	public double weight; // 問4
	
	public static int count = 0; // 問10 人数合計をカウントするクラスフィールド

	Person(String name, int age, double height, double weight) { // 問2,3: コンストラクタを定義して値をセット
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight; // 問4
		
		Person.count++; // 問10 インスタンスごとにカウントを増やす
	}
	
	public double bmi() { // 問6,7 インスタンスメゾットbmi
		return this.weight / (this.height * this.height);
	}
	
	public void print() { // 問8,9 インスタントメゾットprint
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.printf("BMIは%.2fです\n", this.bmi());
	}
}
