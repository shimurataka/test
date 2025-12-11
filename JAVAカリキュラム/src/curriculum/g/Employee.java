package curriculum.g;

public class Employee { // フィールド
	private String employeeId;
	private String name;
		
	public void setEmployeeId(String employeeId) { // setter
		this.employeeId = employeeId;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmployeeId() { // メゾット
		return this.employeeId;
	}
	public String getName() {
		return this.name;
	}
}
