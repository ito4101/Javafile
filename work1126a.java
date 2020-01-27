import java.util.*;
public class work1126a{
	public static void main(String[] args) {
		int[] score = new int[3];
		System.out.println("点数を入力してください");
		for(int count = 0; count < 3; count++){
			score[count]= new java.util.Scanner(System.in).nextInt();
		}
		int mid = med(score[0], score[1], score[2]);
		System.out.println("中央値は"+ mid);
	}
	private static int med(int a, int b, int c) {
		int[] array = {a,b,c};
		int temp;
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length - i-  1; j++){
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array[1];
	}
}