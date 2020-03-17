import java.util.*;
public class AnnotationDemo {
    @SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("apple");
		list.add("ball");
		list.add("cat");
		for(Object obj:list){
			System.out.println(obj);
		}

	}

}
