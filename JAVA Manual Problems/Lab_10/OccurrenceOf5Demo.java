import java.io.FileInputStream;

public class OccurrenceOf5Demo{
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream(args[0]);

		int count = 0;
		int i=fis.read();

		while(i != -1){
			if((char)i == '5')
				count++;
			i=fis.read();
		}

		System.out.println(count);
	}
}