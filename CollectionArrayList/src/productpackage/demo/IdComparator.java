package productpackage.demo;

import java.util.Comparator;

public class IdComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1,Product o2) {
		// TODO Auto-generated method stub
		int result=0;
		if(o1.id<o2.id){
			result=-1;
		}
		else if(o1.id>o2.id){
			result=+1;
		}
		else{
			result=0;
		}
		return result;
	}

}
