package ListInterface;
import java.util.ArrayList;

public class ArrayListExample {

	// All the classes which implement List interface accept duplicate values
	//ArrayList,LinkedList,Vector,Stack   all these implement List interface
	//elements stored in sequential order
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> a=new ArrayList<>();
		a.add("JAPAN");
		a.add("UK");
		a.add("France");
		a.add("America");
		
		System.out.println(a);
		
		a.add(0,"cool");
		
		System.out.println(a);
		
		a.remove(2);
		a.remove("143");
		
		System.out.println(a);
		
		// a.removeAll(a);
		
		System.out.println(a.get(1));
		
		System.out.println(a.contains("UK"));
		System.out.println(a.indexOf("America"));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		
		
		
	}

}
