class SeisekiTester{
	public static void main(String[] args){
		Seiseki Tokyo = new Seiseki("オブジェクト指向プログラミング", "専門科目", 2, 5);
		Seiseki Metropolitan = new Seiseki("線形代数", "基礎数学科目", 3, 2);
		Seiseki University = new Seiseki("実践英語", "教養科目", 4, 7);

		String s = Tokyo.toString();
		System.out.println(s);
		String l = Metropolitan.toString();
		System.out.println(l);
		String m = University.toString();
		System.out.println(m);



	}
}