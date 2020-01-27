import java.util.*;
public class work1126b{
	public static void main(String[] args) {
		int[] score = new int[3];
		System.out.println("数字を入力してください");
		for(int count = 0; count < 2; count++){
			score[count]= new java.util.Scanner(System.in).nextInt();
		}
		ramdom(score[0], score[1]);
	}
	private static void ramdom(int a, int b) {
		Random rand = new Random();
		int i = rand.nextInt(b - a + 1);
		System.out.println(i+a);
		return;
	}
}