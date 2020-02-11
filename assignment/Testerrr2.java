class Creature
 { 
	String getName() 
	{ 
	return "Creature";
	}
	boolean hasFeather()
	{ 
	return false;
	}

}

class Bird extends Creature
 { 
	String getName()
	 {
	return "Bird";
	}

	boolean hasFeather()
	{ 
	return true;
	}

}

public class Tester2 {

public static void main(String[] args) 
{ 	Creature c1=new Bird(); //true
 	System.out.println(c1.getName()); //bird
	 System.out.println(c1.hasFeather()); //true
	 Creature c2=new Creature();
 	System.out.println(c2.getName()); //creature

}

}
