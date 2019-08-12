package personal;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.Set;
	import java.util.TreeMap;
	import java.util.TreeSet;

	public class Hashs {
		public static void  main(String args[])
		{
		Scanner sc=new Scanner(System.in);

		//List<Integer> list=new ArrayList<Integer>();
		int a=sc.nextInt();
		/*list.add(a);
		list.add(a);
		list.add(a);
		System.out.println(list);*/

		/*Map<Integer,String>map=new HashMap<Integer,String>();
		String name=sc.next();
		map.put(a,name);
		map.put(50,"hggs");
		System.out.println(map);
	*/
		Map<Integer,String>map=new TreeMap<Integer,String>();
		String name=sc.next();
		map.put(a,name);
		map.put(50,"hggs");
		System.out.println(map);
		Set<Integer> key=map.keySet();
//		Set<>
		//Iterator<Integer> iterator=map.
		
		System.out.println(key+""+map.values());

		/*Set<Integer> set=new TreeSet<Integer>();
		set.add(a);
		set.add(10);
		set.add(45);
		System.out.println(set);
*/
		}
	}


