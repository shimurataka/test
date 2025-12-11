package curriculum.h;

public class PartTimeEmployee extends Employee{
	private static final int HOURLY_RATE = 1000; // 定数
	public PartTimeEmployee(String id,String name) { // 親のコンストラクタを呼び出す
		super(id, name);
	}
	
	@Override // 抽象メゾットの実装
	public int calculateDailyWage(int hoursWorked) { // 割増なしで単純に計算
		return hoursWorked * HOURLY_RATE;
	}
}
