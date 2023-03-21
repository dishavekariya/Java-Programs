import java.util.Scanner;

public class HalfDimond{
	public static void main(String[] args){
		System.out.print("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a=2;

			for(int i=1; i<=(2*n-1); i++){

				if(i<=n){
					for(int j=1; j<=i; j++){
						System.out.print("*");
					}
				}
			

				if(i>n){
					for(int k=1; k<=(i-a); k++){
						System.out.print("*");
					}
					a++;a++;
				}
			System.out.println("");
		}
	}
}

