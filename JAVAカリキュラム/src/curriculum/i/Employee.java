package curriculum.i;

abstract class Employee { // 抽象クラス
	protected String id;
	protected String name;
	
	public Employee(String id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public abstract int calculateDailyWage(int hoursWorked); // 抽象メゾットで日当を計算する
}

class FullTimeEmployee extends Employee { // フルタイム
	public FullTimeEmployee(String id,String name) {
		super(id, name);
	}
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1250;
		int overtime = Math.max(0, hoursWorked - 8); // 8時間以上を残業換算
		int regularHours = hoursWorked - overtime; // 8時間以内
		return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
	}
}

class ContractEmployee extends Employee { // 契約社員
	public ContractEmployee(String id, String name) {
		super(id,name);
	}
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate; // 残業代なしの単純計算
	}
}