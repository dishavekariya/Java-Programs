interface Transport{
	abstract public void deliver();
}

abstract class Animal{
	abstract public void deliver();
}

class Tiger extends Animal{
	public void deliver(){
		System.out.println("Tiger is delivering...");
	}
}

class Camel extends Animal implements Transport{
	public void deliver(){
		System.out.println("Camel is delivering...");
	}
}

class Deer extends Animal{
	public void deliver(){
		System.out.println("Deer is delivering...");
	}
}

class Donkey extends Animal implements Transport{
	public void deliver(){
		System.out.println("Donkey is delivering...");
	}
}

public class TransportDemo {
	public static void main(String[] args) {
		

		
		Animal[] an = new Animal[4];


		an[0] = new Tiger();
		an[1] = new Camel();
		an[2] = new Deer();
		an[3] = new Donkey();



		for(int i=0;i<4;i++){

			if(an[i] instanceof Transport){
				System.out.println("true");
				an[i].deliver();
			}
		} 
	}
}