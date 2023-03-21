public class SortArray2{
	public static void main(String[] args){
		int[] a={4,6,5,8,9,7,2,0,1,3};

		System.out.println("Before Sorting");

		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
		}

		System.out.println("");

		System.out.println("After Sorting");

		for(int i=0; i<a.length ;i++){

			for(int j=i; j<a.length ; j++){

				if(a[j]<a[i]){

					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}