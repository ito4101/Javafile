class Point3D extends Point2D {
	private int z = 1;
	Point3D(){}
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	double distance(){
		return Math.sqrt(x*x+y*y+z*z);
	}
	double distance(Point b){
		if( b instanceof Point3D){
			Point3D a = (Point3D)b;
			int dx, dy, dz;
			dx = this.x - a.x;
			dy = this.y - a.y;
			dz = this.z - a.z;
			return Math.sqrt(dx*dx+dy*dy+dz*dz);
		} else {
			int dx, dy, dz;
			dx = this.x - b.x;
			dy = this.y - 1;
			dz = this.z - 1;
			return Math.sqrt(dx*dx+dy*dy+dz*dz);
		}
	}
	double distance(Point2D b){
		if( b instanceof Point3D){
			Point3D a = (Point3D)b;
			int dx, dy, dz;
			dx = this.x - a.x;
			dy = this.y - a.y;
			dz = this.z - a.z;
			return Math.sqrt(dx*dx+dy*dy+dz*dz);
		} else {
			int dx, dy, dz;
			dx = this.x - b.x;
			dy = this.y - b.y;
			dz = this.z - 1;
			return Math.sqrt(dx*dx+dy*dy+dz*dz);
		}
	}
	double distance(Point3D b){
		int dx, dy, dz;
		dx = this.x - b.x;
		dy = this.y - b.y;
		dz = this.z - b.z;
		return Math.sqrt(dx*dx+dy*dy+dz*dz);
	}
	public String toString(){
		return String.format("(%d, %d, %d)", x, y, z);
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

	double distance(Point b){
		if( b instanceof Point2D){
			Point2D a = (Point2D)b;
			int dx, dy;
			dx = this.x - a.x;
			dy = this.y - a.y;
			return Math.sqrt(dx*dx+dy*dy);
		} else {
			int dx, dy;
			dx = this.x - b.x;
			dy = this.y - 1;
			return Math.sqrt(dx*dx+dy*dy);
		}
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
		System.out.println("点p1からp2の距離は" + p1.distance(p2));

		Point2D q1 = new Point2D(1, -1);
		Point q2 = new Point2D(0, 1);
		Point3D o1 = new Point3D(0, 0, 0);
		Point3D o2 = new Point3D(3, 4, 0);
		System.out.println("点q1とq2の距離は" + q1.distance(q2));
		System.out.println("点q1とq2の距離は" + q1.distance((Point2D)q2));
		System.out.println("点o1とo2の距離は" + o1.distance(o2));
		System.out.println("点q1とo1の距離は" + o1.distance(q1));
		System.out.println("点q1とp1の距離は" + q1.distance(p1));

	}
}