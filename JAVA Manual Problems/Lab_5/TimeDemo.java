 class Time{
	int hour;
	int min;
	int sec;

	public Time(){
		hour = 0;
		min = 0;
		sec = 0;
	}

	public Time(int hour, int min, int sec){
			setTime(hour,min,sec);
	}
	public void setTime(int hour, int min, int sec){
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

		setTime(t1.hour, t1.min, t1.sec);
	}

	public void print(){
		System.out.println("Hours   = "+ this.hour);
		System.out.println("Minutes = "+ this.min);
		System.out.println("Seconds = "+ this.sec + "\n");
	}
}


public class TimeDemo{
	public static void main(String[] args){
		Time t1 = new Time(3,320,720);
		Time t2 = new Time(2,30,20);

		t1.print();
		t2.print();

		t1.add(t1,t2);
		t1.print();


	}
}