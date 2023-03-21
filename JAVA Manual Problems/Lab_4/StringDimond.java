import java.util.Scanner;

public class StringDimond{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter any word(string) ");
		String s1 = sc.nextLine();
		int l = s1.length();

		for(int i=1; i<=l; i++){

			for(int j=(l-i); j>=1; j--){
				System.out.print(" ");
			}

			for(int k=0; k<i; k++){
				System.out.print(s1.charAt(k)+" ");
			}

			System.out.println("");
		}

	}
}