package productpackage.demo;

import java.util.Date;

public class Product {
	int id;
	String productName;
	Double price;
	Date dom;
	//constructor
    public Product(int id,String productName,Double price,Date dom){
    	this.id=id;
    	this.productName=productName;
    	this.price=price;
    	this.dom=dom;
    }
    public String toString(){
    	return "product["+id+" "+productName+" "+price+" "+dom+" ]";
    }
}
