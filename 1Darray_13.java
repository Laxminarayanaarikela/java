import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    //[0 0 0 0 0 ]
	    for(int i=0; i<n; i++)//i=0 i=1 i=2 i=3 i=4
	    {
	        arr[i]=sc.nextInt();//[4 0 0 0 0] [4 2 0 0 0] [4 2 3 0 0] [4 2 3 4 0] [4 2 3 4 6]
	    }
	    //[4 2 3 4 6]
	    for(int j=n-1; j>=0; j-- )//j=4 j=3 j=2 j=1 j=0
	    {//[4 2 3 4 6] [4 2 3 4 6] [4 2 3 4 6] [4 2 3 4 6] [4 2 3 4 6]
	        System.out.print(arr[j]+"   ");//6 4 3 2 4
	    }
	    
	}
}
