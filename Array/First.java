public class First{
	public static void main(String args[]){
		int[] array = {1,2,3,4,5,6};
		int[][] array2 = { {1,1,1,1,1,1},{2,2,2,2,2,2,2,8},{3,3,3,3,3,3,3,3,3,3,11} };
		boolean flag=false;
		

		for(int i=0; i<array.length;i++){
			System.out.println(array[i]);
		}

		for(int i=0; i<array2.length ; i++){
			for(int j=0; j<array2[i].length; j++)
			{
				System.out.print(array2[i][j]+" ");
			}
			System.out.println("");
		}

		for(int[] temp:array2){
			for(int temp2:temp){
				System.out.print(temp2+" ");
			}
			System.out.println("");
		}

		/* linear serch*/

		for(int j=0; j<array.length; j++){
			if(array[j]==5){
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("there is 5 in array");
		else
			System.out.println("there is no 5 in array");

		

	}
}