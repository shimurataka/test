package curriculum.j;

public abstract class Employee implements Billable{
	protected int id; // フィールド
	protected String name;
	
	/** コンストラクタ
	 * @param id 社員ID
	 * @param name 社員名
	 */
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
