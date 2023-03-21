import java.util.Scanner;

abstract class VegetableClass{
	String color = "noColor";
	int i = 1;
}

class Potato extends VegetableClass{
	String color = "white";

	public String toString(){
		return ("Potato : "+color);
	}
}

class Brinjal extends VegetableClass{
	String color = "purple";

	public String toString(){
		return ("Brinjal : "+color);
	}
}

class Tomato extends VegetableClass{
	String color = "red";

	public String toString(){
		return ("Tomato : "+color);
	}
}

public class Vegetable{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VegetableClass vg;

		System.out.println("Enter a color : white/purple/red");

		String temp = sc.next();

		if(temp.equals("white"))
			vg = new Potato();
		else if(temp.equals("purple"))
			vg = new Brinjal();
		else if(temp.equals("red"))
			vg = new Tomato(); 
		else
			vg = new Potato();

		System.out.println(vg);
	}
}
