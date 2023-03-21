import java.util.Scanner;
class Timeconv{
	static int time(String str){
		return Integer.parseInt(str);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner();
		String str=scan.nextLine();
		int time[]= new int[3];
		for (int i=0,n=0;i<3 ;i++,n++ ) {
			String str1=str.charAt(n)+str.charAt(n+1);
			time[i]=time(str1);
			n++;
		}
		if(str.charAt(8).equals("P")){
			time[0]+=12;
		}
		if(time[0>=48])
			time[0]-=48;
		System.put.println(time[0]+":"+time[1]+":"+time[3]);
	}
}