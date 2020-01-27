public class Account{

	private static int counter = 0;

    private String name;
    private String no;
	private long balance;
	private int id;

    public Account(String name, String no, long balance)
    {
        this.name = name;
        this.no = no;
		this.balance = balance;
		id = ++counter;
    }

    public String getName(){ 
		return name; 
	}
    public String getNo(){
		return no; 
	}
    public long getBalance(){
		return balance;
	}	
	public int getId(){
		return id;
	}
    void deposit(long k){
		balance += k; 
	}
    void withdraw(long k){ 
		balance -= k; 
	}
}
