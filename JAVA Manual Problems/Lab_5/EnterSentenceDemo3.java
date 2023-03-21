import java.util.Scanner;

public class EnterSentenceDemo3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		SentenceVowels sv = new SentenceVowels();
		int total=0;

		System.out.print("Enter a Sentence : ");
		String sent = sc.nextLine();
		sv.str = sent;

		do{

		
		
		System.out.println("Vowels = "+ sv.countVowels(sent));
		total+=sv.countVowels(sent);
		System.out.print("Enter a Sentence : ");
		sent = sc.nextLine();
		sv.str = sent;

		}
		while(sv.str.equals("quit") == false);
		System.out.println("Total vowels are = "+ total);



	}
}

 class SentenceVowels{

 	String str;

	public int countVowels(String str){

		String str2 = str.toLowerCase();
		int count=0;

		for(int i=0; i<str.length(); i++){

			char c= str.charAt(i);

			if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
				count++;
		}

		return count;

	}
}