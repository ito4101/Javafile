import java.util.*;
public class homeworkjava3{
	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		int count = 1;
		boolean flag = true;
		while(flag == true){
			input = input/10;
			if(input == 0){
				break;
			}
			count++;
		}
		System.out.println("桁数は"+ count);

	}
}