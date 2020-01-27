import java.util.*;
public class work1126c{
	public static void main(String[] args) {
		System.out.println("要素数を入力してください");
		int i = new java.util.Scanner(System.in).nextInt();
		int[] orignal =  new int[i];
		for(int count = 0; count < i; count++){
			System.out.print("要素" + (count+1) + ":");
			orignal[count]= new java.util.Scanner(System.in).nextInt();
		}
		int[] clone = new int[i];
		clone = arrayclone(orignal);
		System.out.println("配列の複製完了");
		for(int count = 0; count < i; count++){
			System.out.println("要素" + (count+1) + ":" + clone[count]);
		}
	}
	static int[] arrayclone(int[] a) {
		int[] copy = new int[a.length];
		for (int i = 0; i < a.length; i++){
			copy[i] = a[i];
		}
		return copy;
	}
}