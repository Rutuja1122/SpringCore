package question3;

public interface BankAccountService {
	public double withdraw(long accountId, double balance);
	public double deposite(long accountId, double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount,double amount);

}