package curriculum.k;

/**
 * S: 単一責任の原則
 * D: 依存関係の逆転
 */
public class SalaryReporter { // 社員の情報を引数に入れてReportを出力する
	public void calculateSalaryAndReport(Employee employee) { // ロジックはEmployeeのクラスに任せる
		System.out.println(employee.getReport());
	}
}
