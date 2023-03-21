import java.util.Scanner;

class Student{
	int id;
	int no_of_subjects;
	int[] subcode;
	double[] subCredits;
	String[] gradObtained;
	double spi;

	public Student(int id,int n){
		this.id = id;
		this.no_of_subjects=n;
		subcode = new int[n];
		subCredits = new double[n];
		gradObtained = new String[n];
	}

	public double getSpi(){
		this.spi = 8.5;
		return spi; 
	}
}

public class SpiDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(args[0]);

		Student[] s = new Student[n];

		for(int i=0;i<n;i++){
			s[i] = new Student((100+i),5);

			System.out.println("Enter for 5 subjects:  subject code, subject credit anad grad obtained for that subject");

			for(int j=0;j<5;j++){
				s[i].subcode[j] = sc.nextInt();
				s[i].subCredits[j] = sc.nextInt();
				s[i].gradObtained[j] = sc.next();

			}
			System.out.println("spi = "+ s[i].getSpi());
			
		}
	}
}