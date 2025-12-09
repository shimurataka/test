package curriculum.f;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee(); // クラスのインスタンスを作る
		
		employee.setEmployeeId("E001"); // 値を設定
		employee.setName("佐藤太郎");
		
		employee.showInfo(); // 呼び出す
	}
}
