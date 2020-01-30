public class Seiseki{
	private String course  =  "特別研究一";
	private String category  =  "専門科目";
	private int credit  =  6;
	private int grade  =  5;

	private static String[] title1 = new String[5];
	private static String[] title2 = new String[5];
	private static String[] title3 = new String[5];
	private static int i1 = 0;
	private static int i2 = 0;
	private static int i3 = 0;

	public Seiseki(){}

	public Seiseki(String course){
		this.course = course;
	}

	public Seiseki(String course, String category){
		this(course);
		this.category = category;
	}

	public Seiseki(String course, String category, int credit){
		this(course, category);
		if (credit != 1 && credit != 2 && credit != 4){
			credit = 2;
		}
		this.credit = credit;
	}

	public Seiseki(String course, String category, int credit, int grade){
		this(course, category, credit);
		if ( grade > 5 || grade < 0){
			grade = 0;
		}
		this.grade = grade;
	}

	public String GetCourse(){
		return course;
	}

	public String GetCategory(){
		return category;
	}

	public int GetCredit(){
		return credit;
	}

	public int GetGrade(){
		return grade;
	}

	public String GetGradeName(){
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

	public void putTitle(){
		switch(category){
			case "専門科目":
				title1[i1] = course;
				i1++;
				break;
			case "基礎数学科目":
				title2[i2] = course;
				i2++;
				break;
			case "教養科目":
				title3[i3] = course;
				i3++;
				break;
		}
	}

	public static void printTitle(){

	System.out.println("------専門科目-----");
	for(int i = 0; i < i1; i++)
		System.out.println(title1[i]);
	System.out.println("------基礎数学-----");
	for(int i = 0; i < i2; i++)
		System.out.println(title2[i]);
	System.out.println("------教養科目-----");
	for(int i = 0; i < i3; i++)
		System.out.println(title3[i]);

	}
	
	public void printSeiseki(){
		System.out.println("単位取得: " + GetGradeName());
	}

	public String toString(){
		return String.format("科目名:%s, 種類:%s, 単位:%d, 成績:%d", course, category, credit, grade);
	}

}

