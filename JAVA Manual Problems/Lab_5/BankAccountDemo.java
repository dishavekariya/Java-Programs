import java.util.Scanner;

public class BankAccountDemo{
	public static void main(String[] args){

		BankAccount b1 = new BankAccount();

		b1.getActDetails();
		b1.displayActDetails();
	}
	
}

class BankAccount{
	int actNo;
	String userName,email,actType;
	float actBalance;
	Scanner sc = new Scanner(System.in);

	public void getActDetails(){

		System.out.print("\n Enter Act numebr : ");
		this.actNo = sc.nextInt();

		System.out.print("\n Enter user name : ");
		this.userName = sc.next();

		System.out.print("\n Enter email : ");
		this.email = sc.next();

		System.out.print("\n Enter Act type : ");
		this.actType = sc.next();

		System.out.print("\n Enter Act balance : ");
		this.actBalance = sc.nextFloat();

	}

	public void displayActDetails(){

		System.out.print("\n Acount Name : "+ actNo);
		System.out.print("\n User Name : "+ userName);
		System.out.print("\n Email : "+ email);
		System.out.print("\n Acount Type : "+ actType);
		System.out.print("\n Acount Balance : "+ actBalance);
	}
}