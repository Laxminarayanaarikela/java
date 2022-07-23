import java.util.Scanner;
public class Main
{
	public static void main(String[] args) //n=10, arr= 1 4 3 7 5 9 2 8 0 6, (1,6),(4,0),(3,8),(7,2),(5,9)
	{                                              //   0 1 2 3 4 5 6 7 8 9   (0,9),(1,8),(2,7),(3,6),(4,5)
	    Scanner sc=new Scanner(System.in);                      //             7     4     11    9     14   
	    int max=0;
	    int n=sc.nextInt();
	    int[] arr= new int[n];
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
        for(int j=0; j<n/2; j++)
    	    {
    	     //  System.out.print(" ("+j+"  "+(j+1)+")");
            //   System.out.print(" ("+(arr[j]+arr[((n-1-j))])+")");
               if((arr[j]+arr[((n-1-j))])>max)
               {
                   max=(arr[j]+arr[((n-1-j))]);
               }
    	    }   
    	    System.out.print(max);
    }
}
