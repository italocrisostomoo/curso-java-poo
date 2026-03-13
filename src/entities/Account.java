package entities;

public class Account {
	
	private double withdrawalTax = 5.00;
	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void Deposit(double depositValue) {

		balance += depositValue;
	}

	public void Withdrawal(double withdrawalValue) {
		
		balance = balance - withdrawalValue - withdrawalTax;
	}

	public String toString() {

		return "Account: " + number + ", " + "Holder: " + holder + ", Balance: US$" + String.format("%.2f", balance);

	}
}
