package personal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String args[])
	{
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(10,"supriya");
		map.put(11, "snehal");
		System.out.println(map);
		map.put(12, "priti");
		System.out.println(map);
		
		//System.out.println(map.keySet()+""+map.values());
		/*if(map.size()>0)
		{
			System.out.println(map.get(10));
		}*/
		Set<Integer>set=map.keySet();
		System.out.println(map.get(set));
		 Set<Map.Entry<Integer, String>> mappingGeeks = map.entrySet(); 
	        System.out.println("Set of Keys and Values : "+mappingGeeks); 
	        System.out.println(); 
	  
	        //  Creating an iterator 
	        System.out.println("Use of Iterator to remove the sets."); 
	        Iterator<Entry<Integer, String>> geeks_iterator = map.entrySet().iterator(); 
	        while(geeks_iterator.hasNext()) 
	        { 
	            Entry<Integer, String> entry = geeks_iterator.next(); 
	            //  Removing a set one by one using iterator 
	            geeks_iterator.remove(); // right way to remove entries from Map, 
	            // avoids ConcurrentModificationException 
	            System.out.println("Set of Keys and Values : "+mappingGeeks); 
	  
	        } 
	    } 

		
		
	}


