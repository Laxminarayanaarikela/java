import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int[] arr=new int[n];
	    for(int x=0; x<n; x++)
	    {
	        arr[x]=sc.nextInt();
	        System.out.print(arr[x]*k+" ");
	    }
	}
}
