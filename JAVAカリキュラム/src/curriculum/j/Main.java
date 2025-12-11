package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Billable> staffList = new ArrayList<>(); // List<Billable>社員を追加
		staffList.add(new FullTimeEmployee(101, "田小 太郎"));
		staffList.add(new FullTimeEmployee(102, "田中 次郎"));
		staffList.add(new ContractEmployee(201, "田大 三郎"));

		int taroHours = 8; // 働いた時間
		int jiroHours = 9; // 契約社員は10時間勤務（残業は適用されないと仮定）
		int saburoHours = 10; // 正社員は9時間勤務（残業が適用される）

		System.out.println("社員の日給");

		// for-each ループで Billable 型だけを使って costForDay を呼び出し、日給を計算
		// ポリモーフィズムでList<Billable>に格納されているインスタンスのcostForDay()メソッドが実行される。
		int totalCost = 0;

		for (Billable billableStaff : staffList) { // 働いた時間を入る変数を作る
			int hours = 0;
			String type = "";

			if (billableStaff instanceof FullTimeEmployee) { // 働いた時間を入る
				if (((Employee) billableStaff).id == 101) {
					hours = taroHours;
					type = "正社員（8h）";
				} else {
					hours = jiroHours;
					type = "正社員（9h）";
				}
			} else if (billableStaff instanceof ContractEmployee) {
				hours = saburoHours;
				type = "契約社員（10h）";
			}

			int dailyCost = billableStaff.costForDay(hours);
			totalCost += dailyCost;

			if (billableStaff instanceof Employee) { // Employeeにキャストして名前を取得して表示
				Employee staff = (Employee) billableStaff;
				System.out.printf("%s, 勤務時間: %2d時間 -> 日給: %,d円\n", staff.toString(), hours, dailyCost);
			}
		}

		System.out.printf("計算された日給の合計: %,d円\n", totalCost);
	}
}
