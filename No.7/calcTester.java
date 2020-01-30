public class calcTester{
	public static void main(String[] args){
		Traiangle T1 = new Traiangle();
		Traiangle T2 = new Traiangle(2.0, 4.5);
		Pyramid P1 = new Pyramid();
		Pyramid P2 = new Pyramid(2.0, 4.5, 7.5);
		double sample1 = T1.calcArea();
		double sample2 = T2.calcArea();
		double sample3 = P1.calcVol();
		double sample4 = P1.calcArea();
		double sample5 = P2.calcVol();
		double sample6 = P2.calcArea();

		System.out.println(sample1);
		System.out.println(sample2);
		System.out.println(sample3);
		System.out.println(sample4);
		System.out.println(sample5);
		System.out.println(sample6);
	}
}