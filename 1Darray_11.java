import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of array");
	    int size=sc.nextInt();
	    int sum=0;
	    int[] arr=new int[size];
	    System.out.print("enter the elements in array");
	    for(int i=0; i<size; i++)
	    {
	        arr[i]=sc.nextInt();
	    }     
	        System.out.print("sum of all odd indexes = ");
	    for(int i=0; i<size; i++)
	    {
	        sum=sum+i;
	        if((arr[i]%2)==1)
	        {
	            System.out.print(sum+"   ");
	        }
	    }   
	        System.out.print("\n");
	        System.out.print("indexes of all even numbers = ");
	    for(int i=0; i<size; i++)
	    {
	         if((arr[i]%2)==0)
    	        {
    	            System.out.print(i+"   ");
    	        }
	    }    
	}
}





