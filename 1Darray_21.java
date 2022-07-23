import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int sum=0;
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=n-1; i>=0; i--)//i=5 i=4 i=3 i=2 i=1
	    {
	        arr[i]=sc.nextInt();//1  7   8   4   2
	        sum=sum+arr[i];
	    }
	      System.out.print(sum+"   ");
	}
}
