package SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		// Set interface implementation classes do not accept duplicate values and will not give any error
		// HashSet, SortedSet,TreeSet,LinkedHashSet  classes implement Set interface
		// There is no guarantee elements stored in sequential order ........Random order
		
		
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Lalit");
		hs.add("Mahori");
		hs.add("Champion");
		hs.add("Lalit");
		hs.add("Unemployee");
		
		System.out.println(hs);
		
		System.out.println(hs.remove("Mahori"));
		
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}
}
