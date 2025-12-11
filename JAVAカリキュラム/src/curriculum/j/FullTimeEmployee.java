package curriculum.j;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee( int id, String name) { // コンストラクタ
		super(id, name);
	}
	
	/**
	 * 正社員の日給を計算する 1250円/h 8時間超過は1.25倍
	 * @param hoursWorked
	 * @return 日給
	 */
	
	@Override
	public int costForDay(int hoursWorked) {
		final int baseRate = 1250;
		final int starndardHours = 8;
		int cost;
		
		if (hoursWorked <= starndardHours) {
			cost = hoursWorked * baseRate;
		} else {
			int standardCost = starndardHours * baseRate;
			int overtimeHours = hoursWorked - starndardHours;
			int overtimeRate = (int)(baseRate * 1.25);
			int overtimeCost = overtimeHours * overtimeRate;
			cost = standardCost + overtimeCost;
		}
		return cost;
	}
	
	@Override
	public String toString() {
		return "正社員[ID:" + id + ", 名前" + name + "]";
	}
}
