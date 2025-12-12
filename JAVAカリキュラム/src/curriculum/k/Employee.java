package curriculum.k;

/**
 *  D: 依存関係逆転の原則
 *  O: 開放・閉鎖の原則
 */
public interface Employee {
	String getName();
	String getType(); // 便宜上のメゾット
	int getHours(); // 便宜上のメゾット
	
	int calculateSalary(); // S: 単一責任の原則
	String getReport();
}

class FullTimeEmployee implements Employee { // フルタイム社員
	private final String name;
	private final int hours; // 例
	
	public FullTimeEmployee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	@Override
	public String getName() { return name; }
	
	@Override
	public String getType() { return "FullTime"; }
	
	@Override
	public int getHours() { return hours; }
	
	@Override
	public int calculateSalary() { // フルタイム給料計算
		return hours * 1200;
	}
	
	@Override
	public String getReport() { // 出力
		return name + " の給料は " + calculateSalary() + " 円";
	}
}


class ContractEmployee implements Employee { // 契約社員
	private final String name;
	private final int hours;
	
	public ContractEmployee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	@Override
	public String getName() { return name; }

	@Override
	public String getType() { return "Contract"; }
	
	@Override
	public int getHours() { return hours; }
	
	@Override
	public int calculateSalary() { // 契約社員給料計算
		return hours * 1000;
	}
	
	@Override
	public String getReport() { // 出力
		return name + " の給料は" + calculateSalary() + " 円";
	}
}