package entities;

public class ExConta {
	private int accountNumber;
	private String accountName;
	private double balance;

	public ExConta() {
	}
	
	public ExConta(int accountNumber, String accountName, double balance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public ExConta(int accountNumber, String accountName){
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}

	public void setBalance(double depositValue) {
		this.balance += depositValue;
	}
	
	public void withdrawBalance(double withdrawValue) {
		this.balance -= (withdrawValue + 5.0);
	}
	
	public String toString() {
		return "Account " + accountNumber + ", "
				+ "Holder: " + accountName + ", "
				+ "Balance: " + "$ " + String.format("%.2f", balance);		
	}
}