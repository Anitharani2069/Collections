package personal;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapArrays {
	public void square(int arr[])
	{
		int len=arr.length;
		/*int arr1[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr1[i]=arr[i]*arr[i];
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
			//arr1[i]=arr[i]*arr[i];
		}*/
		//return arr1;
		HashMap<Integer, Integer>hm=new HashMap<Integer, Integer>();
		for(int i=0;i<len;i++)
		{
			hm.put(arr[i],arr[i]*arr[i]);
		}
		System.out.println(hm); 
		
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
		HashMapArrays se=new HashMapArrays();
		se.square(arr);
		
	}

}
