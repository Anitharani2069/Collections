package personal;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collections {
	public static void main(String args[])
	{
		/*List<Integer> list=new ArrayList<Integer>() ;
		list.add(10);
		list.add(20);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		*/
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "cvsjd");
		hm.put(2, "csdh");
		hm.put(5,"vjkh");
		hm.put(3, "dta");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(hm.get(num));
		//Set key=hm.keySet();
		//Iterator it=key.iterator();
		//int i ;
		//String str;
		/*while(it.hasNext())
		{
		 i=(int) it.next();
		// str=(String) it.next();
		 
		}
		//System.out.println(i);

		System.out.println(hm);*/
		
	}

}
