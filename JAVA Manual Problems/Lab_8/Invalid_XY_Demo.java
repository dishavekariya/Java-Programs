
public class Invalid_XY_Demo{
	public static void main(String[] args){

		Exception e = new Exception("Entered value is not numeric");

		for(int i=0;i<2;i++){

			try{
				if(isNumeric(args[i])){

				}
				else{
					throw e;
				}
			}
			catch(Exception ex){
				e.printStackTrace();
				args[i]="1";
			}
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println(a*b);
	}

	public static boolean isNumeric(String s1){
		if(s1==null)
			return false;
		try{
			int num = Integer.parseInt(s1);
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
}