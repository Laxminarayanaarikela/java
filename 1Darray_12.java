import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    boolean b=true;
	    int n=sc.nextInt();
	    boolean arr[]=new boolean[n];
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextBoolean();
	    }
	    for(int j=0; j<n-1; j++)
	    {
	   // System.out.print(arr[j]&&arr[(j+1)]);
	    b=arr[j]&&arr[(j+1)];
	    }
	    System.out.print(b);
	}
}
