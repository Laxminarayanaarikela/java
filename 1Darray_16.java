import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int count=0;
	    int n=sc.nextInt();
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	        if ((a<=arr[i])&&(b>=arr[i]))
    	    {
    	        count++;
     	    }
	    }
	    System.out.print(count);
	}
}
