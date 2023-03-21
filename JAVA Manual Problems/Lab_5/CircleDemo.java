import java.util.Scanner;

public class CircleDemo{
	public static void main(String[] args){
		Circle c1 = new Circle();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a radious of circle ");
		c1.r = sc.nextDouble();

		System.out.print("\n Area of circle is "+ c1.areaOfCircle());
	}
}