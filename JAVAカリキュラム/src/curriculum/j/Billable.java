package curriculum.j;

public interface Billable { // 請求可能なふるまいを定義する
	/**
	 * 
	 * @param hoursWorked
	 * @return
	 */
	int costForDay(int hoursWorked);
}
