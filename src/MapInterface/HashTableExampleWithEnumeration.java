package MapInterface;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExampleWithEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// shows how to get all keys as Enumeration object.By calling keys() method ,
		// we can get all keys as Enumeration object.By using Enumeration methods like 
		// hasMoreElements() and nextElement() we can read all values from Hashtable.
		
		
		Hashtable <String,String> hm=new Hashtable<String,String>();
		
		// add key-value pair to Hashtable
		
		hm.put("first", "Automation");
		hm.put("second", "API Testing");
		hm.put("third", "Appium");
		
		Enumeration<String> keys=hm.keys();
		
		while(keys.hasMoreElements())
		{
			String key=keys.nextElement();
			
			System.out.println("Value   of  " +key+ "   is:  " +hm.get(key));
		}
		
		
	}

}
