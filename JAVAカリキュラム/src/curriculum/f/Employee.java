package curriculum.f;

public class Employee {
	private String employeeId; // フィールド
	private String name;
	
	public void setEmployeeId(String employeeId) { // setter
		this.employeeId = employeeId;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() { // メゾット
		System.out.println("社員ID:" + this.employeeId + ",名前:" + this.name);
	}
}
