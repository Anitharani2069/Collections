package personal;
import java.util.HashMap;
import java.util.Scanner;

public class SearchKey {
	public void square(int arr[])
	{
		HashMap<Integer, Integer>hm=new HashMap<Integer, Integer>();
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		SearchKey se=new SearchKey();
		se.square(arr);
		
	}

}
