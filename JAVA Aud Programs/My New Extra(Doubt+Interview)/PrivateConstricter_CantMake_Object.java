class Class1{
	Class1(){
		System.out.println("default constructer called");
	}

	Class1(int n){
		System.out.println("Perameterised constructer called"+n);
		System.out.println("Perameterised constructer called second time");
	}
	public class PrivateConstricter_CantMake_Object{
		public static void main(String[] args){
			Class1 c1 = new Class1(4);
		}
	}
}







// When default constructer is private and object is declared with default constructer, it does not let 
// you make an object with default constructer.
// 
// But when you make an object with another constructer (which should be defined in that class) ,
// you can make an object.

// This is used as pattern
// when you want to make only one object of the class and let every one use that object.
// For that you should make default constructer private.(when that class has only default constructer)
// And make that one object in that class