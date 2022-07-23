import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);//scanner class object
	    System.out.println("enter size of array");//print statement to print size 
	    int size=sc.nextInt();//declaring part and user initialization of size
	    int[] arr=new int[size];//size will store here
	    System.out.print("enter the elements in array");//print statement
	    for(int i=0; i<=size; i++)//
	    {
	        arr[i]=sc.nextInt();
	        int element=arr[i];
	        for(element=1; element<=10; element++)
		    System.out.println(arr[i]+"*"+element+"="+(arr[i]*element));
	    }
	}
}


