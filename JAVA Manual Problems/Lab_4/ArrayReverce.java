import java.util.Scanner;

public class ArrayReverce{
	public static void main(String[] args){

Scanner sc = new Scanner(System.in);
		int[] a1 = new int[7];
		int[] a2 = new int[7];
		System.out.println("Enter 7 array element seperated by space.");

		for(int i=0; i<a1.length; i++){
			a1[i]=sc.nextInt();

		}

		int i=(a1.length)-1;
		for(int temp : a1){
			a2[i]=temp;
			i--;
		}

		for( int temp : a2){
			System.out.print(temp+" ");
		}

	}
}

  