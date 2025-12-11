package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		List<Employee>employeeList = new ArrayList<>(); // Listを作ってclassで分ける
		
		employeeList.add(new FullTimeEmployee("F001", "佐藤 太郎")); // 人を入れる
		employeeList.add(new FullTimeEmployee("F002", "田中 花子"));
		employeeList.add(new ContractEmployee("C001", "山田 次郎"));
		employeeList.add(new ContractEmployee("C002", "鈴木 美咲"));
		
		System.out.println("日当計算結果");
		
		for (Employee emp : employeeList) { // for-eachでcalculateDailyWageを呼び出してEmployeeとして扱う
			int hours = 0; // 勤務時間を入れる
			if (emp.id.startsWith("F001")) {
				hours = 10;
			} else if (emp.id.startsWith("F002")) {
				hours = 8;
			} else if (emp.id.startsWith("C001")) {
				hours = 9;
			} else {
				hours = 6;
			}
			
			int dailyWage = emp.calculateDailyWage(hours); // 適切なものを引っ張ってくる
			
			System.out.printf("社員ID: %s, 氏名: %s, 勤務時間: %d時間, 日当: %,d円%n",emp.id,emp.name, hours, dailyWage);
		}
	}
}
