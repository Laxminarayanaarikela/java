import java.util.Scanner;
public class Main
{
	public static void main(String[] args)//               7      5       4         8          2
	{                                             //     {1 7}  {1 5}   {1 2 4}   {1 2 4 8}   {1 2}
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[]arr=new int[n];
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    for(int i=n-1; i>=0; i--) //
	    {
	        int number=arr[i];
	       System.out.print("{");
    	        for(int j=1; j<=number; j++)// 1<=7 7<=7    1<=5 5<=5 
    	        {
        	        if(number%j==0)//7%1 7%7   5%1  5%5
        	        {
        	        System.out.print(j+",");//1 7    1 5
                    }
    	        }
	        System.out.print("}");
	    } 
	}
}
