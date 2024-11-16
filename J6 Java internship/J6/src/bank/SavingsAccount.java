package bank;

public class SavingsAccount implements Account {
	
	private String id;
	private double balance, interestRate;

	public SavingsAccount(String id, double bal, double rate) {
		
		this.id = id;
		this.balance = bal;
		this.interestRate = rate;
	}

	@Override
	public void deposit(double amt) {
		// TODO Auto-generated method stub

	}

	@Override
	public double withdraw(double amt) {
		
		return amt;
		
	}

	@Override
	public double Check_balance() {
		
		return balance;
		
	}

	@Override
	public double Calc_interest() {
		
		return balance;
		
	}

}
