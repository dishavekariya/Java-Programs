class OddThread extends Thread{
	public void run(){
		for(int i=1; i<=20;i++){
			if(i%2==1){
				System.out.println(i);
			}
			try{
				sleep(500);
			}catch(Exception e){

			}
		}
	}
}

class EvenThread extends Thread{
	public void run(){
		for(int i=1; i<=20;i++){
			if(i%2==0){
				System.out.println(i);
			}
			try{
				sleep(500);
			}catch(Exception e){
				
			}
		}
	}
}
public class OddEvenThread{
	public static void main(String[] args){
		OddThread t1 = new OddThread();
		EvenThread t2 = new EvenThread();

		t1.start();
		t2.start();
	}
} 