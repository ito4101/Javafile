
import java.util.Scanner;

class Day{
	private int year = 1;
	private int month = 1;
	private int date = 1;

	public Day(){
	}
	public Day(int year){
		this.year = year;
	}
	public Day(int year, int month){
		this(year);
		this.month = month;
	}
	public Day(int year, int month, int date){
		this(year, month);
		this.date = date;
	}
	public Day(Day d){
		this(d.year, d.month, d.date);
	}


	int getYear() {return year;}
	int getMonth() {return month;}
	int getDate() {return date;}

	void setYear(int year) {this.year = year;}
	void setMonth(int month) {this.month = month;}
	void setDate(int date) {this.date = date;}

	void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	int dayOfWeek(){
		int y = year;
		int m = month;
		if (m == 1 || m == 2){
			y--;
			m += 12;
		}
		return (y + y / 4 -y / 100 + y/ 400 + (13 * m + 8) / 5 + date) % 7;
	}

	public String toString(){
		String[] wd = {"日","月", "火", "水", "木", "金", "土"};
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}
}

class DayTester{
		
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String[] wd = {"日","月", "火", "水", "木", "金", "土"};
		System.out.println("誕生日を西暦で入力せよ");
		System.out.print("年:"); int y = stdIn.nextInt();
		System.out.print("月:"); int m = stdIn.nextInt();
		System.out.print("日:"); int d = stdIn.nextInt();

		Day birthday = new Day(y, m, d);
		Day homework1 = new Day(500, 1, 1);
		Day homework2 = new Day(1000, 1, 1);
		Day homework3 = new Day(2000, 1, 1);

		System.out.println("あなたの誕生日" + birthday.getYear() + "年" + birthday.getMonth() + "月" + birthday.getDate() + "日は" + wd[birthday.dayOfWeek()] + "曜日です");
		System.out.println(homework1.getYear() + "年" + homework1.getMonth() + "月" + homework1.getDate() + "日は" + wd[homework1.dayOfWeek()] + "曜日です");
		System.out.println(homework2.getYear() + "年" + homework2.getMonth() + "月" + homework2.getDate() + "日は" + wd[homework2.dayOfWeek()] + "曜日です");
		System.out.println(homework3.getYear() + "年" + homework3.getMonth() + "月" + homework3.getDate() + "日は" + wd[homework3.dayOfWeek()] + "曜日です");
	}

}
