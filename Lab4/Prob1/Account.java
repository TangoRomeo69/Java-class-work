public class Account{
	private String accName;
	private String acId;
	private int balance;
	
	public Account(){
		this.accName = "";
		this.acId = "";
		this.balance = 0;
	}
	
	public Account(String accName, String acId, int balance){
		this.accName = accName;
		this.acId = acId;
		this.balance = balance;
	}
	
	public void deposit(int amount){
		this.balance += amount;
	}
	
	public void withdraw(int amount){
		this.balance -= amount;
	}
}