public class ArrayAvg{

	public static void main(String[] args){
		int[] nums = {3,2,4,2};
		double sum=0;

		for(int i=0; i<4; i++){
			sum+=nums[i];
		}

		double avg=sum/(nums.length);

		System.out.println("Average is = "+ avg);
	}
	
}