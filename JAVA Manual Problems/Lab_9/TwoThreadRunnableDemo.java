class MyThread1 implements Runnable{
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println("Good Morning");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}

		}
	}
}

class MyThread2 implements Runnable{
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println("Good Afternoon");
			try{
				Thread.sleep(3000);
			}catch(Exception e){
				e.printStackTrace();
			}

		}
	}
}

public class TwoThreadRunnableDemo{
	public static void main(String[] args){
		Thread t1 = new Thread(new MyThread1());
		Thread t2 = new Thread(new MyThread2());

		t1.start();
		t2.start();
	}
}