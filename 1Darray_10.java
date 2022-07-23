import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter siize of an array");
		int size=sc.nextInt();
		int[]  arr=new int[size];
		System.out.println("enter the elements in array");
		for(int i=0; i<size; i++)
		{
		    arr[i]=sc.nextInt();
		    System.out.print(arr[i]*arr[i]+"    ");
		}
	}
}
