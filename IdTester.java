class Id{
	static int counter = 0;
	static int max = 0;

	private int id;

	public Id(){
		id = ++counter;
	}

	public int getId(){
		return id;
	}
	static int getMaxId(){
		if(max < counter){
			max = counter;
		}
		return max;

	}
}

public class IdTester{

	public static void main(String[] args){
		Id a = new Id();
		Id b = new Id();

		System.out.println("aの識別番号:" + a.getId());
		System.out.println("bの識別番号:" + b.getId());
		System.out.println("a.counter" + a.getId());
		System.out.println("b.counter" + b.getId());
		System.out.println("識別番号の最大値" + Id.getMaxId());
	}
}