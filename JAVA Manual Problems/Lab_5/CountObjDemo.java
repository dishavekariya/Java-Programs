public class CountObjDemo{
	public static void main(String[] args){

		JustClass c1 = new JustClass();
		JustClass c2 = new JustClass();
		JustClass c3 = new JustClass();
		JustClass c4 = new JustClass();
		JustClass c5 = new JustClass();


		System.out.println("Count 0f objects is = "+ JustClass.objCount);
	}
}

class JustClass{
	static int objCount=0;

	public JustClass(){
		this.objCount++;
	}
}