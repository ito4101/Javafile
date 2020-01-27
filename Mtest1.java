class Math1{
	static double sin(double x){
		return Math.sin(Math.PI*(x));
	}
	static double cos(double x){
		return Math.cos(Math.PI*(x));
	}
	static double tan(double x){
		return Math.tan(Math.PI*(x));
	}
}
class Mtest1{
	public static void main(String[] args){
		Double a1 = Math1.cos(0.7);
		Double a2 = Math1.sin(0.5);
		System.out.println(a1+2*a2);
		Double b1 = Math1.sin(0.8);
		Double b2 = Math1.cos(0.2);
		System.out.println(1.0/(2*b1+b2));
		Double c1;
		c1 = 0.0;
		for(double k = 1; k < 6; k++){
			c1 = c1 + (2*Math.tan(k/10)) + Math.tan(2*k/10);
		}
		System.out.println(c1);

	}
}