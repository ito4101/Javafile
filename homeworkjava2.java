import java.util.*;
public class homeworkjava2{
	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		Random rand = new Random();
		int i = rand.nextInt(11);
		System.out.println(input-(i-5));

	}
}