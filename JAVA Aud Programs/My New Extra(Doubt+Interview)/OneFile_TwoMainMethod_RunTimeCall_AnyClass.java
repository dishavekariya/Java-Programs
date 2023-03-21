class A{

	public static void main(String[] args) {
		System.out.println("A class main method called");
	}

}

public class OneFile_TwoMainMethod_RunTimeCall_AnyClass{

	public static void main(String[] args){
		System.out.println("Demo class main method called");
	}
}

// There are more than one classes in one file.
// More than one class has main(String[] args) method in it.
// To compile a File you need only one public class with same name as file name.(javac FileName)
// Then more than one ClassFiles are been made.
// 
// But when you are doing ( java ClassFile_Name )
// you can call any Class (ClassFile) you want by writing its name after (java A)
// (If you want to call another class's main method first)