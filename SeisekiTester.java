class Seiseki{
	private String course;
	private String category;
	private int credit;
	private int grade;

	Seiseki(String course, String category, int credit, int grade){
		this.course = course;
		this.category = category;
		if (credit != 1 && credit != 2 && credit != 4){
			credit = 2;
		}
		this.credit = credit;
		if ( grade > 5 || grade < 0){
			grade = 0;
		}
		this.grade = grade;
	}
	String GetCourse(){
		return course;
	}

	String GetCategory(){
		return category;
	}

	int GetCredit(){
		return credit;
	}

	int GetGrade(){
		return grade;
	}

	String GetGradeName(){
		String str = "";
		switch(grade){
			case 5:
				str = "秀";
				break;
			case 4:
				str = "優";
				break;
			case 3:
				str = "良";
				break;
			case 2:
				str = "可";
				break;
			case 1:
			case 0:
				str = "不可";
				break;
		}
		return str;
	}
	
	void printSeiseki(){
		System.out.println("単位取得: " + GetGradeName());
	}

}

class SeisekiTester{
	public static void main(String[] args){
		Seiseki Tokyo = new Seiseki("オブジェクト指向プログラミング", "専門科目", 2, 5);
		Seiseki Metropolitan = new Seiseki("線形代数", "基礎数学科目", 3, 2);
		Seiseki University = new Seiseki("実践英語", "教養科目", 4, 7);

		System.out.println("科目名: " + Tokyo.GetCourse());
		System.out.println("種類: " + Tokyo.GetCategory());
		System.out.println("単位: " + Tokyo.GetCredit());
		System.out.println("成績: " + Tokyo.GetGrade());
		Tokyo.printSeiseki();

		System.out.println("科目名: " + Metropolitan.GetCourse());
		System.out.println("種類: " + Metropolitan.GetCategory());
		System.out.println("単位: " + Metropolitan.GetCredit());
		System.out.println("成績: " + Metropolitan.GetGrade());
		Metropolitan.printSeiseki();

		System.out.println("科目名: " + University.GetCourse());
		System.out.println("種類: " + University.GetCategory());
		System.out.println("単位: " + University.GetCredit());
		System.out.println("成績: " + University.GetGrade());
		University.printSeiseki();


	}
}
