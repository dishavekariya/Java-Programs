import java.util.Arrays;
import java.util.Scanner;

class prg3Dev{
	public static void main(String[] args) {

        int hr=9,min=30;

		Scanner scan= new Scanner(System.in);
		int number [][]= new int[scan.nextInt()][],max,hr=9,min=30,index;

		Scanner scan1= new Scanner(System.in);
		for (int i=0;i<number.length ;i++){             //Taking Inputs in String format and Converting into array of numbers

			String str= scan1.nextLine();
			str= str.substring(1, (str.length() - 1));
			String temp []= str.split(",");
			number [i]= new int[temp.length];
			for (int j=0;j< temp.length;j++ )
				number[i][j]=Integer.parseInt(temp[j]);
		}
       for(int i=0;i<number.length;i++){
           max=number[i][1]-number[i][0];
           for(int j=0;j<number[i].length-1;j++){
                if(max<(number[i][j+1]-number[i][j])){
                    max=number[i][j+1]-number[i][j];
                    index=(j+1)*10;
                }
           }
           index+=30;
           if(index>=60){
               hr+=(int)(index/60);
               index%=60;
           }
           System.out.println(max+hr+'.'+index);
       }

       void timeSet(int min){

        min = this.min+min;
        if(min<60)
            this.min= min;
        else
            this.min=min%60;
        this.hr=this.hr+(min/60);

        while(hr>12){
            hr=hr-12;
            this.hr = min%60;
        }
        this.hr = hr;
       }
       
    }
}