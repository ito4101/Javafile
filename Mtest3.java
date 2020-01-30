class Math3{
	double x = 0.0;
	Math3(double x){
		this.x = x;
	}
	void setX(double x){
		this.x = x;
	}
	double getX(){
		return x;
	}
	double sin(){
		return Math.sin(x);
	}
	double cos(){
		return Math.cos(x);
	}
	double tan(){
		return Math.tan(x);
	}
	double sin2(){
		return Math.sin(Math.PI*(x));
	}
	double cos2(){
		return Math.cos(Math.PI*(x));
	}
	double tan2(){
		return Math.tan(Math.PI*(x));
	}
}
class Mtest3{
	public static void main(String[] args){
		Math3 a1 = new Math3(0.7);
		Math3 a2 = new Math3(0.5);
		double ans11 = a1.cos2();
		double ans12 = a2.sin2();
		System.out.println(ans11 + 2*ans12);
		Math3 b1 = new Math3(0.8);
		Math3 b2 = new Math3(0.2);
		double ans21 = b1.sin2();
		double ans22 = b2.cos2();
		System.out.println(1.0/(2*ans21+ans22));
		double answer;
		answer = 0.0;
		for(double k = 1; k < 6; k++){
			Math3 c1 = new Math3(k/10);
			Math3 c2 = new Math3(2*k/10);
			answer = answer + (2 * c1.tan2()) + c2.tan2();
		}	
		System.out.println(answer);
	}
}