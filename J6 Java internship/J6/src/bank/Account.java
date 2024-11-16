package bank;

public interface Account {

	public abstract void deposit(double amt);
	public abstract double withdraw(double amt);
	public abstract double Check_balance();
	public abstract double Calc_interest();
}
