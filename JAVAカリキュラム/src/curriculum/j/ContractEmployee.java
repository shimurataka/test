package curriculum.j;

public class ContractEmployee extends Employee {
	public ContractEmployee(int id,String name) {
		super(id, name);
	}
	
	/**
	 * 契約社員の日給を計算する 1000円/h
	 * @param hoursWorked
	 * @return 日給
	 */
	@Override
	public int costForDay(int hoursWorked) {
		final int rate = 1000;
		return hoursWorked * rate; // intにキャストして返す
	}
	
	@Override
	public String toString() {
		return "契約社員[ID:" + id + ", 名前" + name + "]";
	}
}
