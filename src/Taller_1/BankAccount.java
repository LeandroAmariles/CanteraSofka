package Taller_1;

/**
 * Creates a BankAccount object with account number and activity;
 * @author Leandro
 *
 */

public class BankAccount {
	
	private int accountNumber;
	private boolean activity;
	
	/**
	 * creates a new object BankAccount with only the number account
	 * @param account number of the account
	 */
	public BankAccount(int account) {
		this.accountNumber=account;	
	}
/**
 * creates a nwe object BankAccount
 * @param account Number number of the count
 * @param activity it says if the account is active or deactivated (true=active, false= deactivated)
 */
	public BankAccount(int accountNumber, boolean activity) {
		super();
		this.accountNumber = accountNumber;
		this.activity = activity;
	}
/**
 * Methods for manipulate  and show the attributes
 * @return
 */

	public boolean isActivity() {
		return activity;
	}


	public void setActivity(boolean activity) {
		this.activity = activity;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	

}
