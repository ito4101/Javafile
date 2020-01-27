import java.util.*;
public class homeworkjava4{
	public static void main(String[] args) {
		System.out.println("人数を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		int[] score = new int[input];
		int count = 0;
		System.out.println("点数を入力してください");
		for(count = 0; count < input; count++){
			score[count]= new java.util.Scanner(System.in).nextInt();
		}
		int sum = 0;
		int high = 0;
		int low = 100000;
		for(count = 0; count < input; count++){
			sum = sum + score[count];
			if(high < score[count]){
				high = score[count];
			}
			if(low > score[count]){
				low = score[count];
			}
		}
		int ave = sum/input;
		System.out.println("合計点は"+ sum);
		System.out.println("平均点は"+ ave);
		System.out.println("最高点は"+ high);
		System.out.println("最低点は"+ low);
	}
}