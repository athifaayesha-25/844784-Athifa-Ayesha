import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("Initial set: " +set);
		System.out.println("Reverse set:" +set.descendingSet());
		System.out.println("Head Set:" +set.headSet("D"));
		System.out.println("Subset:" +set.subSet("A",false,"E",true));
		System.out.println("TailSet:" +set.tailSet("C",false));

	}

}
