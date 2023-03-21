import java.util.Scanner;

public class EnterSentenceDemo{
	public static void main(String[] args){

		int totalVowel=0;

		do{

			EnterSentence es = new EnterSentence();
			 totalVowel+= es.countVowel();
		}
		while(es.EnterSentence());

		System.out.println("Total vowels are = "+ totalVowel);
	}

}

class EnterSentence{

	Scanner sc = new Scanner(System.in);
	String[] sent = new String[50];

	public EnterSentence(){
		getSentence();

	}

	public int getSentence(){

		System.out.print("Enter a sentence : ");

		for(int i=0; true ;i++){

			// Scan

			sent[i] = sc.nextLine();
			sent = sent + sent[i];

			//stop scanning sentence when its '.' there.

			int l = sent[i].length();
			if(sent[i].charAt(l-1)=='.'){
				break;
			}

			// when "quit" is entered

			if(sent[0].equals("quit"))
				return 0;
			else{

			// pirnting vovels in current sentence.

			System.out.print("/n Vowels in this Sentence are = "+ getVowel());
			return 1;
			}

		}
	}

	public int getVowel(String[] sent){

		int countVowel=0;

		for(int i=0; i<sent.length; i++){
			for(int j=0; j<sent[i].length(); j++){

				char c = sent[i].charAt(j);
				if(c=='a'|| c=='A'|| c=='e'|| c=='E'|| c=='i'|| c=='I'|| c=='o'|| c=='O'|| c=='u'|| c=='U')
					countVowel++;

			}
		}
		return countVowel;
	}
}