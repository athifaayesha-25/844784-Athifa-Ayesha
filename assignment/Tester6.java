interface Colorable {
 }
 interface Bouncable extends Colorable { 
} 
class Super implements Bouncable { 
}
 class Sub extends Super implements Bouncable { 
}
 class Individual { 
}
 public class Tester6 { 
public static void main(String[] args) { 
System.out.print(new Sub() instanceof Super); 
System.out.print(new Sub() instanceof Colorable); 
System.out.print(new Super() instanceof Sub); 
System.out.print(new Individual() instanceof Super); 
}
 } 


/* Output:Tester6.java:16: error: incompatible types: Individual cannot be converted to Super
System.out.print(new Individual() instanceof Super);
*/