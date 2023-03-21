import java.util.Scanner;

public class ArrayRowSummation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);

		int[][] arr;
		MyThread[] tr;

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<row; i++){
			tr[i] = new MyThread(arr[i]);
			tr[i].start();

		}
	}
}

class MyThread extends Thread{
	int[] a;
	int sum;

	public MyThread(int[] a){
		this.a = a;
	}

	public void run(){
		for(int i=0; i<a.length; i++){
			sum+=a[i];
		}
		System.out.println(sum);
	}
}