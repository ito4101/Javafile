import java.util.Scanner;
class DayAssign{
		
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String[] wd = {"日","月", "火", "水", "木", "金", "土"};

		System.out.println("誕生日を西暦で入力せよ");
		System.out.print("年:"); int y = stdIn.nextInt();
		System.out.print("月:"); int m = stdIn.nextInt();
		System.out.print("日:"); int d = stdIn.nextInt();

		Day birthday = new Day(y, m, d);
		System.out.println("あなたの誕生日" + birthday.getYear() + "年" + birthday.getMonth() + "月" + birthday.getDate() + "日は" + wd[birthday.dayOfWeek()] + "曜日です");
		Day xDay = new Day(y, m, d);
		System.out.println("xDay = " + xDay.getYear() + "年" + xDay.getMonth() + "月" + xDay.getDate() + "日は(" + wd[xDay.dayOfWeek()] + ")");
		xDay.setYear(2100);
		xDay.setMonth(12);
		xDay.setDate(31);

		System.out.println("birthday = " + birthday.getYear() + "年" + birthday.getMonth() + "月" + birthday.getDate() + "日は(" + wd[birthday.dayOfWeek()] + ")");
		System.out.println("xDay = " + xDay.getYear() + "年" + xDay.getMonth() + "月" + xDay.getDate() + "日は(" + wd[xDay.dayOfWeek()] + ")");
		
	}

}
