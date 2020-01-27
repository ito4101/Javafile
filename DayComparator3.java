import java.util.Scanner;
class DayComparator3{

	static boolean compDay(Day d1, Day d2){
		return d1.getYear() == d2.getYear() && d1.getMonth() == d2.getMonth() && d1.getDate() == d2.getDate();
	}
	static boolean compDayOfWeek(Day d1, Day d2){
		String[] wd = {"日","月", "火", "水", "木", "金", "土"};
		return wd[d1.dayOfWeek()] == wd[d2.dayOfWeek()];
	}
		
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
	
		int y, m, d;
		System.out.println("日付１を入力せよ");
		System.out.print("年:"); y = stdIn.nextInt();
		System.out.print("月:"); m = stdIn.nextInt();
		System.out.print("日:"); d = stdIn.nextInt();
		Day day1 = new Day(y, m, d);

		System.out.println("日付2を入力せよ");
		System.out.print("年:"); y = stdIn.nextInt();
		System.out.print("月:"); m = stdIn.nextInt();
		System.out.print("日:"); d = stdIn.nextInt();
		Day day2 = new Day(y, m, d);

		if (compDay(day1, day2)){
			System.out.println("等しいです");
		} else {
			System.out.println("等しくないです");
		}
		if (compDayOfWeek(day1, day2)){
			System.out.println("同じ曜日です");
		} else {
			System.out.println("同じ曜日ではないです");
		}
	}

}
