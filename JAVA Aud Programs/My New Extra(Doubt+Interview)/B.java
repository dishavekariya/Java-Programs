class A{
	void method(int a){
		System.out.println("Parent method called");
	}
	
}
class C extends A{
	void method(int a){
		System.out.println("Child method called");
	}
}
public class B{
	public static void main(String[] args) {
		C obj= new C();
		obj.method(1);
	}
}