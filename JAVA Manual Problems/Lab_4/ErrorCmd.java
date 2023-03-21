public class ErrorCmd{
	public static void main(String[] args){
		char c = args[0].charAt(0);
		if(c>='A' && c<='Z'){
			System.out.println("No error");
		}
		else
			System.out.println("Entered string dosent start with capital.Program is terminated.");
	}
}