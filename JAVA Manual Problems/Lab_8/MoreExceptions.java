public class MoreExceptions{
	public static void main(String[] args){
		Exception e = new Exception();

		int n=5,sum=0;

		for(int i=0; i<5; i++){
			int a = Integer.parseInt(args[i]);

			try{
				if(a<0 || a%10==0 || (a>1000 && a<2000) || a>7000){
					throw e;
				}
				else{
					sum+=a;
				}
			}
			catch(Exception exp){
				System.out.println("Entered no "+ a +" is not valied");
			}
		}

		System.out.println(sum);
	}
}