package curriculum.k;

public class Main {
	public static void main(String[] args) {
		Employee ftEmployee = new FullTimeEmployee("山田", 160); // インスタンスの生成
		Employee ctEmployee = new ContractEmployee("佐藤", 180);
		
		SalaryReporter reporter = new SalaryReporter(); // レポーターのインスタンス化
		
		reporter.calculateSalaryAndReport(ftEmployee);
		reporter.calculateSalaryAndReport(ctEmployee);
		
		// O: 開放・閉鎖の原則
		System.out.println("\n新しい社員タイプを追加しても、SalaryReporterは変更不要です。");
	}
}
