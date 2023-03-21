class Dev1{
	private Dev1(){
		System.out.println("default constructer called");
	}

	Dev1(int n){
		System.out.println("Perameterised constructer called"+n);
		System.out.println("Perameterised constructer called second time");
	}

	static class Dev2{
		public static Dev1 getObj(){
			return new Dev1();
		}
	}
}

public class Dev{
	public static void main(String[] args){
		Dev1 d = Dev1.Dev2.getObj();
		
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