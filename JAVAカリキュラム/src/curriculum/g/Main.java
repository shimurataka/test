package curriculum.g;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee(); // クラスのインスタンスを作る
		
		employee.setEmployeeId("E002"); // 値を設定
		employee.setName("田中花子");
		
		System.out.println("社員ID: " + employee.getEmployeeId() + ", 名前: " + employee.getName()); // 出力
	}
}
