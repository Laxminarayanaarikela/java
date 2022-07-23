import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    int n; int k;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the array size n");
	    n=sc.nextInt();
	    System.out.println("enter the number k");
	    k=sc.nextInt();
	    int [] arr=new int[n];
	    System.out.print("enter the elements in array ");
	    for (int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	        System.out.print(arr[i]*k+" ");
	    }
	}
}
