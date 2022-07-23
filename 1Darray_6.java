import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    int max=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of an array");
	    int size=sc.nextInt();
	    int[] arr=new int[size];
	    System.out.print("enter the elements in array");
	    for(int i=0; i<size; i++)
	    {
	        arr[i]=sc.nextInt(); 
	        if(arr[i]>max)
	        {
	        max=arr[i];
	        }
	    }
	   	System.out.print(max);
	}
}
