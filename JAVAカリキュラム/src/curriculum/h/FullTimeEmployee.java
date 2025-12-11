package curriculum.h;

public class FullTimeEmployee extends Employee{
	private static final int HOURLY_RATE = 1200; // 定数
	
	private static final int REGULAR_HOURS = 8; // 通常勤務時間
	private static final double OVERTIME_PREMIUM = 1.25; // 残業時の割り増し分
	
	public FullTimeEmployee(String id,String name) { // 親のコンストラクタを呼び出す
		super(id, name);
	}
	
	@Override // 抽象メゾットの実装
	public int calculateDailyWage(int hoursWorked) {
		int regularWage = 0;
		int overtimeWage = 0;
		
		if (hoursWorked >= REGULAR_HOURS) {
			regularWage = REGULAR_HOURS * HOURLY_RATE; // 通常業務内の給料
			int overtimeHours = hoursWorked - REGULAR_HOURS; // 残業時間
			overtimeWage = (int)(overtimeHours * HOURLY_RATE * OVERTIME_PREMIUM); // 残業代
		} else {
			regularWage = hoursWorked * HOURLY_RATE; // 8時間未満の時
		}
		
		return regularWage + overtimeWage;
	}
}
