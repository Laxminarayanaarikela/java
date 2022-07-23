import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of array");
	    int size=sc.nextInt();
	    int[] arr=new int[size];
	    System.out.print("enter the elements in array");
	    for(int i=0; i<size; i++)
	    {
	        arr[i]=sc.nextInt();
	    }     
	        System.out.print("odd elements in array =");
	        for(int i=0; i<size; i++)
	    {
	        if((arr[i]%2)==1)
	        {
	            System.out.print(arr[i]+"   ");
	        }
	    }   
	        System.out.print("\n");
	        System.out.print("even elements in array =");
	    for(int i=0; i<size; i++)
	    {
	         if((arr[i]%2)==0)
    	        {
    	            System.out.print(arr[i]+"   ");
    	        }
	    }    
	}
}





