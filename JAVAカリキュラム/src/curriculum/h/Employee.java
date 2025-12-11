package curriculum.h;

public abstract class Employee {
	protected String employeeId; // フィールドにサブクラスからアクセスできるようにする
	protected String name;
	
	public Employee(String id, String name) { 
		this.employeeId = id; // コンストラクタ
		this.name = name;
	}
	
	public String getEmployeeId() { // メゾット
		return employeeId;
	}
	public String getName() {
		return name;
	}
	
	public abstract int calculateDailyWage(int hoursWorked); // 抽象メゾット
}
