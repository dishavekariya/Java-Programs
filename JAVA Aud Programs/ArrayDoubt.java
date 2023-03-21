import java.util.Scanner;

class ArrayDoubt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number between 4 to 9");
		int n = sc.nextInt();

		int[] a;
		a = new int[n];

		for(int i=0; i<a.length; i++){
			System.out.print("Enter element "+ (i+1) +" ");
			a[i] = sc.nextInt();
		}

		for( int temp : a){
			System.out.print(temp+" ");
		}
	}
}