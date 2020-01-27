public class Traiangle {
	private double b = 1.0;
	private double h = 1.0;

	public Traiangle(){
	}

	public Traiangle(double b, double h){
		this.b = b;
		this.h = h;
	}

	public double getB(){
		return b;
	}

	public double getH(){
		return h;
	}

	public void setB(double b){
		this.b = b;
	}

	public void setH(double h){
		this.h = h;
	}

	public double calcArea(){
		return (b*h)/2;
	}
}