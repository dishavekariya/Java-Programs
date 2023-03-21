import java.util.Scanner;

public class Vow_Con{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		MyString s1 = new MyString();
		MyString s2 = new MyString("I entered ");

		System.out.println("Enter a sentence : ");
		s1.str = sc.nextLine();

		s1.countVowels();
		s2.countVowels();

		System.out.println(" First string vowel n cons are "+ (s1.vowels) +" "+ (s1.con));
		System.out.println(" Second string vowel n cons are "+ s2.vowels +" "+ s2.con);
	

	}
	
}

class MyString{

	String str;
	int vowels=0,con=0;

	public MyString(){

	}

	public MyString(String str){
		this.str=str;
	}

	public void countVowels(){

		String str2= str.toLowerCase();

		for(int i=0; i<str.length(); i++ ){
			char c = str2.charAt(i);

			if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
				vowels++;
			else if(c!=' ' && c!='.' && c!=',')
				con++;
		}
	}
}