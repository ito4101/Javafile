class Traiangle {
	private double b = 1.0;
	private double h = 1.0;

	Traiangle(){
	}

	Traiangle(double b, double h){
		this.b = b;
		this.h = h;
	}

	double getB(){
		return b;
	}

	double getH(){
		return h;
	}

	void setB(double b){
		this.b = b;
	}

	void setH(double h){
		this.h = h;
	}

	double calcArea(){
		return (b*h)/2;
	}
}

public class Pyramid extends Traiangle{
	private double k = 1.0;
	//側面積は底辺がbで高さがhの半分とkを合わせたものの平方根とする

	public Pyramid(){
	}

	public Pyramid(double b, double h, double k){
		super(b, h);
		this.k = k;
	}

	public void setK(double k){
		this.k = k;
	}

	public double getK(){
		return k;
	}

	public double calcVol(){
		return super.getB()*super.getH()*k/3;
	}

	public double calcArea(){
		double sum1 = super.calcArea();
		double sum2 = 3 * super.getB() * Math.sqrt(super.getH() * super.getH() + k * k);
		return sum1 + sum2;
	}




}