public class Seiseki{
	private String course  =  "特別研究一";
	private String category  =  "専門科目";
	private int credit  =  6;
	private int grade  =  5;

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
		this.credit = credit;
	}

	public Seiseki(String course, String category, int credit, int grade){
		this(course, category, credit);
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
	
	public void printSeiseki(){
		System.out.println("単位取得: " + GetGradeName());
	}

	public String toString(){
		return String.format("科目名:%s, 種類:%s, 単位:%d, 成績:%d", course, category, credit, grade);
	}

}

