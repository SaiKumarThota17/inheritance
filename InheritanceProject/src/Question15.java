

class Account
{
	private String accountHolder;
	private int accountNumber;
	private float balance;
	private String AccountType;
	public Account(String accountHolder,int accountNumber,float balance,String AccountType)
	{
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.AccountType=AccountType;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	
}
class SavingsAccount extends Account
{
	private double intersetRate;
	
	public SavingsAccount(String accountHolder, int accountNumber, float balance, String AccountType,double intersetRate) {
		super(accountHolder, accountNumber, balance, AccountType);
		this.intersetRate=intersetRate;
		
	}

	public double getIntersetRate() {
	return intersetRate;
}
}


public class Question15 {

	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount("sai",35523,15000.0f, "HDFC",10.05);
		System.out.println("Account Holder :"+sa.getAccountHolder());
		System.out.println("Account accountNumber :"+sa.getAccountNumber());
		System.out.println("Account balance :"+sa.getBalance());
		System.out.println("Account AccountType :"+sa.getAccountType());
		System.out.println("Account intrestRate :"+sa.getIntersetRate());
	}
}
		
		
		
		
		
		
		

	
