import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(32);
		set.add(12);
		set.add(78);
		System.out.println("Highest value:" +set.pollFirst());
		System.out.println("Lowest value:" +set.pollLast());

	}

}
