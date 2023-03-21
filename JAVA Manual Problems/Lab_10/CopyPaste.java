import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyPaste{
	public static void main(String[] args){
		FileInputStream fis = new FileInputStream("MyTextFor1.txt");
		FileOutputStream out = new FileOutputStream("MyCopiedFile.txt");

		int i = fis.read();

		while(i != -1){
			out.write(i);

			i = fis.read();
		} 

		String s = "disha my name.";
		byte b[] = s.getBytes();

		out.write(b);

		System.out.println("Done");
	}
}