public class work1126d{
	public static void main(String[] args) {

		System.out.println("aを入力してください");
		int a = new java.util.Scanner(System.in).nextInt();
		System.out.println("bを入力してください");
		int b = new java.util.Scanner(System.in).nextInt();
		System.out.println("cを入力してください");
		int c = new java.util.Scanner(System.in).nextInt();


		System.out.println("要素数を入力してください");
		int i = new java.util.Scanner(System.in).nextInt();
		int[] orignal =  new int[i];
		for(int count = 0; count < i; count++){
			System.out.print("要素" + count + ":");
			orignal[count]= new java.util.Scanner(System.in).nextInt();
		}
		System.out.println("aとbでの最小値は" + min(a, b) + "です");
		System.out.println("aとbとcでの最小値は" + min(a, b, c) + "です");
		System.out.println("配列の最小値は:" + 	min(orignal));
	}
	static int min(int a, int b){
		if(a < b){
			return a;
		} else {
			return b;
		}
	}
	static int min(int a, int b, int c){
		int mini = a;
		if(b < mini){
			mini = b;
		}
		if(c < mini){
			mini = c;
		}
		return mini;
	}
	static int min(int[] a) {
		int mini = a[0];
		for(int i = 0; i < a.length; i++){
			if(mini > a[i]){
				mini = a[i];
			}
		}
		return mini;
	}
}

