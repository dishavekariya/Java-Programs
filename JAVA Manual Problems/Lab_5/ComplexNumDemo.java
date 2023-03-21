import java.util.Scanner;

public class ComplexNumDemo{
	public static void main(String[] args){

		ComplexNum c1 = new ComplexNum(2,3);
		ComplexNum c2 = new ComplexNum(40,99);

		System.out.println("c1 = "+c1.real+" i "+c1.img);
		System.out.println("c2 = "+c2.real+" i "+c2.img);


		ComplexNum.printAdd(c1,c2);
	}
}

class ComplexNum{
	float real;
	float img;

	public ComplexNum(){
		this.real = 0;
		this.img = 0;
	}
	public ComplexNum(float real){
		this();
		this.real=real;
	}
	public ComplexNum(float real,float img){
		this(real);
		this.img= img;
	}

	public static void printAdd(ComplexNum n1,ComplexNum n2){
		System.out.println("Ans = "+(n1.real+n2.real)+" "+ (n1.img+n2.img)+"i");
	}


}