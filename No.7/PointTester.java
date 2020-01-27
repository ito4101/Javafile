class Point3D extends Point2D {
	private int z = 1;
	Point3D(){}
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
}

class Point2D extends Point {
	protected int y = 1;
	Point2D(){}
	Point2D(int x, int y){
		super(x);
		this.y = y;
	}
	double distance(){
		return Math.sqrt(x*x+y*y);
	}
	double distance(Point2D b){
		int dx, dy;
		dx = this.x - b.x;
		dy = this.y - b.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	public String toString(){
		return String.format("(%d, %d)", x, y);
	}
}

class Point {
	protected int x = 1;
	Point(){}
	Point(int x){
		this.x = x;
	}
	double distance(){
		return Math.sqrt(x*x);
	}
	double distance(Point b){
		int dx;
		dx = this.x - b.x;
		return Math.sqrt(x*x);
	}
	public String toString(){
		return String.format("(%d)", x);
	}
}


class PointTester {
	public static void main(String[] args){
		Point p1 = new Point(2);
		Point p2 = new Point(-3);
		System.out.println("点p1から原点からの距離は" + p1.distance());
		System.out.println("点p1からp2の距離は" + p1.distance());

		Point2D q1 = new Point2D(1, -1);
		Point q2 = new Point2D(0, 1);
		System.out.println("点q1とq2の距離は" + q1.distance(q2));
		System.out.println("点q1とq2の距離は" + q1.distance((Point2D)q2));
		System.out.println("q2はPointか:" + (q2 instanceof Point));
		System.out.println("q2はPoint2Dか:" + (q2 instanceof Point2D));
		System.out.println("q2はPoint3Dか:" + (q2 instanceof Point3D));
	}
}