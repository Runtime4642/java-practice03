package prob5;

public class Account {
	private String accountNo;
	private int balance;
	public void save(int money)
	{
		System.out.println(this.accountNo+"에 "+money+"만원이 입금");
		this.balance += money;
		System.out.println(this.accountNo+"계좌의 잔고는 "+this.balance);
	}
	public void deposit(int money)
	{
		System.out.println(this.accountNo+"에 "+money+"만원이 출금");
		this.balance-=money;
		System.out.println(this.accountNo+"계좌의 잔고는 "+this.balance);
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(String accountNo)
	{
		this.accountNo = accountNo;
	}
}