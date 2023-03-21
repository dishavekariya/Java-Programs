import java.util.Scanner;

public class Solution2
{

  public static void main(String args[])
    {
        Solution2 p = new Solution2();

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] array=new int[x];
        for (int i=0;i<x;i++)
        {
            array[i]=i+1;
        }


        p.fp(array, array.length, array.length);
        
    }
    void pp(int array[], int n)
    {
        System.out.print("[");
        for (int i = 0; i < n; i++){
            if(i<n-1)
                System.out.print(array[i] + ",");
            else System.out.print(array[i]+"]");

            
        }
        
    }

    void fp(int array[], int size, int n)
    {
        if (size == 1)
            pp(array, n);
        for (int i = 0; i < size; i++)
        {
            fp(array, size - 1, n);


            if (size % 2 == 1)
            {
                int temp = array[0];
                array[0] = array[size - 1];
                array[size - 1] = temp;
            }

            else
            {
                int temp;
                temp = array[i];
                array[i] = array[size - 1];
                array[size - 1] = temp;
            }

        }

    }

}