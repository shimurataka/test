package curriculum.e;

public class Employee {
	private String name; // フィールド
	
	public void setName(String name) { // setter
		this.name = name;
	}
	
	public void work() { // 出力
		System.out.println(this.name + "は働いています。");
	}
}
