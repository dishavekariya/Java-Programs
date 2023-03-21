import java.io.FileInputStream;

public class Char_Word_Sentence{
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("MyTextFor1.txt");
		int ch=0,word=0,sen=0;

		int i=fis.read();

		if(i!= -1){
			word++;
			sen++;
		}

		while(i != -1){

			ch++;

			char c = (char)i;

			if(c==32){
				word++;
				ch--;
			}else if(c==13){
				sen++;
				ch--;
				ch--;
				word++;
			}

			i = fis.read();
		}

		System.out.println("Characters "+ch);
		System.out.println("Words "+word);
		System.out.println("Sentence "+sen);

	}
}