public class SortArray{
	public static void main(String[] args){
		int[] a = {5,4,7,3,9,8,2,1,0,6};
		

		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}


	}
}