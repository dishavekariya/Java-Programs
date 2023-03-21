class insufficientFundException extends Exception{
	public insufficientFundException(String s){
		System.out.println(s);
	}
}

class Account{
	double balance =0;

	public Account(double balance){
		this.balance = balance;
	}

	Exception insufficientFundException = new Exception();

	public void deposite(double amount){
		balance += amount; 
	}

	public void withdraw(double amount) throws Exception{
		if(amount<=balance){
			balance -= amount;
		} 
		else{
			throw insufficientFundException;
		}
	}
}

public class AccountDemoException{
	public static void main(String[] args){
		Account ac1 = new Account(5000);

		ac1.deposite(2000);
		try{
			ac1.withdraw(8000);
		} 
		catch(Exception exp){
			System.out.println("Withdraw will not be allowed bacause entered withdraw amount is more than your balance.");
		}

		System.out.println(ac1.balance);

	}
}