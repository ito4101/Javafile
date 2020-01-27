//銀行口座クラス
class Account{
    private String name;
    private String no;
    private long balance;
    //追加
    private Day o_date;

    Account(String name, String no, long balance, Day o_date)
    {
        this.name = name;
        this.no = no;
        this.balance = balance;
        //追加
        this.o_date = new Day(o_date);
    }

    public String getName()        { return name; }
    public String getNo()        { return no; }
    public long getBalance()    { return balance; }
    void deposit(long k)        { balance += k; }
    void withdraw(long k)        { balance -= k; }

    //追加
    public Day getODate()
    {
        return new Day(o_date);
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("＝＝＝").append(this.name).append("の口座＝＝＝").append("\\n");
        sb.append("口座名義：").append(this.name).append("\\n");
        sb.append("口座番号：").append(this.no).append("\\n");
        sb.append("預金残高：").append(this.balance).append("\\n");
        sb.append("口座開設日：").append(this.o_date.toString()).append("\\n");
        return sb.toString();
    }
}

class AccountTester2
{
    public static void main(String[] args)
    {
        Account adachi = new Account("足立太郎", "123456", 1000, new Day(2015, 12, 25));
        Account nakata = new Account("中田次郎", "654321",  200, new Day(2015, 11, 11));

        // 足立太郎の口座
        System.out.println(adachi.toString());

        // 中田次郎の口座
        System.out.println(nakata.toString());
    }
}