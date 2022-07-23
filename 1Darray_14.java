import java.util.Scanner;
public class Main
{
	public static void main(String[] args) //n=10, arr= 1 4 3 7 5 9 2 8 0 6, (1,4),(4,3),(3,7),(7,5),(5,9),(9,2),(2,8),(8,0),(0,6)
	{                                              //   0 1 2 3 4 5 6 7 8 9   (0,1),(1,2),(2,3),(3,4),(4,5),(5,6),(6,7),(7,8),(8,9) 1
	    Scanner sc=new Scanner(System.in);                      //             i,j   i,j
	    int n=sc.nextInt();
	    int[] arr= new int[n];
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
        for(int j=0; j<n-1; j++)
    	    {
    	     //  System.out.print(" ("+j+"  "+(j+1)+")");
               System.out.print(" ("+(arr[j]+arr[(j+1)])+")");
               
    	    }   
    }
}
