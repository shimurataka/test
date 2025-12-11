package curriculum.h;

public class Main {
	public static void main(String[] args) {
		final int HOURS_WORKED = 9; // 勤務時間
		FullTimeEmployee fullTime = new FullTimeEmployee("F001", "田中"); // 正社員
		PartTimeEmployee parttime = new PartTimeEmployee("P001", "佐藤"); // パート
		int fullTimeWage = fullTime.calculateDailyWage(HOURS_WORKED); // 正社員の給料計算
		int partTimeWage = parttime.calculateDailyWage(HOURS_WORKED); // パートの給料計算

		System.out.println("正社員の給料" + fullTimeWage + "円");
		System.out.println("パート社員の給料" + partTimeWage + "円");
	}
}
