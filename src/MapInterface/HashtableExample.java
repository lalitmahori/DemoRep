package MapInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // randomly store
		
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		
		hm.put(0,"Lalit");
		hm.put(43,"Mahori");
		hm.put(42,"Chalo");
		
		System.out.println(hm);
		System.out.println(hm.get(43));
		System.out.println(hm.remove(42));
		
		System.out.println(hm.get(42));
		
		Set s=hm.entrySet();
		
		Iterator it=s.iterator();
		
		
		
		while(it.hasNext())
		{
			
			//System.out.println(it.next());
			Map.Entry mp=(Map.Entry)it.next();
			
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		
		
	}

}
