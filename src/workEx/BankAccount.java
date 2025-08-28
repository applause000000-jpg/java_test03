package workEx;

public class BankAccount {

	private String accountNumber;
	private String owner;
	private int balance;
	

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance(String accountNumber) {
		return this.balance;
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void deoosit(String accountNumber, int m) {
		for(int i=0;i<2;i++) {
			if(this.getAccountNumber()==accountNumber) {
				int a = this.getBalance(accountNumber);
				a+=m;
				
			}
			
		}
	}
	public void withdraw() {
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
