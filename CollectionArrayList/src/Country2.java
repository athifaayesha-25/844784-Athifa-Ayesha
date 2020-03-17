//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Country2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<String> hs=new HashSet<String>();//unpredictable
		//LinkedHashSet<String> hs=new LinkedHashSet<String>();
		TreeSet<String> hs=new TreeSet<String>();
		hs.add("Apple");
		hs.add("Zebra");
		hs.add("Melon");
		hs.add("Russia");
		hs.add("apple");
        hs.add("zebra");
        hs.add("pome");
        System.out.println(hs);
	}

}
