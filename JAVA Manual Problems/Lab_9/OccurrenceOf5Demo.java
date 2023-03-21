public class OccurrenceOf5Demo{
	public static void main(String[] args){
		FileInputStream fis = new FileInputStream(args[0]);

		int count = 0;
		int i=fis.read();

		while(i != -1){
			if((char)i == "5")
				count++;
		}

		System.out.println(count);
	}
}