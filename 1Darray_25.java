import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{	        
	    int minvalue=10000;
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    int[] arr=new int[size];
	    for(int i=0; i<size; i++)
	    {
	        arr[i]=sc.nextInt(); 
	        if(arr[i]<minvalue)
	        {
	        minvalue=arr[i];
	        }
	       	System.out.print(minvalue+" ");
	       	
	    }
	}
}
