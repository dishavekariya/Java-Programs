import java.util.Scanner;

class Sentence{
	String[] sent = new String[50];
	int vowels=0;
	int totalVowels=0;
	Scanner sc = new Scanner(System.in);

	public Sentence(){
		enterSentences();
	}

	public void enterSentences(){

		
		do{

			System.out.println("Enter a sentence.");

			int i=0;
			do{
				sent[i]= sc.nextLine();
				i++;
			}
			while(sent[i]!="\n");

			
		}while(sent[1]!="quit");


		this.totalVowels+=countVowels();
		printVowels();

	}

	public int countVowels(){

		for(int i=0; i<sent.length; i++){
			for(int j=0; j<sent[i].length(); j++){

				char c = sent[i].charAt(j);
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
					this.vowels++;
			}
		}
		return vowels;
	}

	public void printVowels(){
		System.out.print("\n N of vowels are "+ countVowels());
	}
}




public class SentenceDemo{
	public static void main(String[] args){
		Sentence s1 = new Sentence();

		System.out.println("Total vowels are "+ s1.totalVowels);
	}
}