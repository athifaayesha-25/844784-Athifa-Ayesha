package productpackage.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1=new Date();
		System.out.println(d1);
		GregorianCalendar gc=new GregorianCalendar(2012,01,15);
		Date d2=gc.getTime();
		System.out.println(d2);
		Product p1=new Product(1234,"Refrigirator",36000.0,d1);
		Product p2=new Product(2234,"Television",35000.0,d2);
		Product p3=new Product(3234,"Refrigirator",25000.0,d1);
		Product p4=new Product(1235,"Refrigirator",15000.0,d2);
		ArrayList<Product> productList=new ArrayList<Product>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		for(Product p:productList)
		{
			System.out.println(p);
		}
		NameComparator ndc=new NameComparator();
		/*IdComparator idc=new IdComparator();
		Collections.sort(productList,idc);
		System.out.println("*** after sort ***");
		for(Product p:productList){
			System.out.println(p);
		}
		System.out.println("*** after sort reverse order ***");
		Collections.sort(productList,Collections.reverseOrder(idc));
		for(Product p:productList){
			System.out.println(p);
		}*/
		Collections.sort(productList,ndc);
		for(Product p:productList){
			System.out.println(p);
		}
		Collections.sort(productList,Collections.reverseOrder(ndc));
		for(Product p:productList){
			System.out.println(p);
		}
		

		

	}

}
