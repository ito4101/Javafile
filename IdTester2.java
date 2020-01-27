import java.util.Scanner;

class ExId{
	private static int counter = 0;
	private int id;


	public ExId(int y){
		id = counter + y;
		counter = id;
	}

	public int getId(){
		return id;
	}
}

public class IdTester2{

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int x1, x2;
		x1 = stdIn.nextInt();
		ExId a = new ExId(x1);
		x2 = stdIn.nextInt();
		ExId b = new ExId(x2);

		System.out.println("aの識別番号:" + a.getId());
		System.out.println("bの識別番号:" + b.getId());
	}
}