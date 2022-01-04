package question3;

import org.springframework.beans.factory.annotation.Autowired;

public class BankAccount
{
	private int accountId;
	private String accountHolderName;
	private String accountType;
	private int accountBalance;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	@Autowired
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	

}