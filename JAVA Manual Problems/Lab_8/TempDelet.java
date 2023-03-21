import java.util.Scanner;

public class TempDelet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double balance =5000;

		System.out.println(" Enter the amount you want to withdraw.");
		int withdraw = sc.nextInt();

		try{
			if(balance-withdraw < 0){
				throw new Exception("You do not have this much amount in your account");
			}
			else
				balance-=withdraw;
		}catch(ArithimaticException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Finally used");
		}

		System.out.println(balance);
	}
}