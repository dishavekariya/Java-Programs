 class Timet{
	int hour;
	int min;
	int sec;

	public static Timet(){
		hour = 0;
		min = 0;
		sec = 0;
	}
	public static Timet(int hour, int min, int sec){
		if(sec>=60){
			min = min + sec/60;
			this.sec = sec%60;
		}
		else
			this.sec= sec;

		if(min>=60){
			hour = hour+ min/60;
			this.min = min%60;
		}
		else
			this.min = min;
		this.hour = hour;
	}

	public void add(Time t1, Time t2){
		t1.hour+= t2.hour;
		t1.min += t2.min;
		t1.sec += t2.sec;

		this(t1.hour, t1.min, t1.sec);
	}

	public static void print(){
		System.out.println("Hours = "+ t.hour);
		System.out.println("Minutes = "+ t.min);
		System.out.println("Seconds = "+ t.sec);
	}
}


public class Time{
	public static void main(String[] args){
		Time t1 = new Time(3,70,70);
		Time t2 = new Time(2,30,20);

		t1.print();

	}
}