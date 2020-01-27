class AccountTester
{
    public static void main(String[] args)
    {	
		Account adachi = new Account("足立太郎", "123456", 1000);
		Account nakata = new Account("中田次郎", "654321",  200);

        System.out.println("＝＝＝足立太郎の口座＝＝＝");
        System.out.println("口座名義：" + adachi.getName());
        System.out.println("口座番号：" + adachi.getNo());
		System.out.println("預金残高：" + adachi.getBalance());
		System.out.println("識別番号" + adachi.getId());

        System.out.println("＝＝＝中田次郎の口座＝＝＝");
        System.out.println("口座名義：" + nakata.getName());
        System.out.println("口座番号：" + nakata.getNo());
		System.out.println("預金残高：" + nakata.getBalance());
		System.out.println("識別番号" + nakata.getId());


    }
}