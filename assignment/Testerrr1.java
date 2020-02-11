class Creature { 
void grow() 
{}

}

class Bird extends Creature {
 void fly() {}

}

class Falcon extends Bird { 
void hunt() {}

}

public class Tester1 {

public static void main(String[] args)
 { 
Creature c1 = new Bird(); //true

Falcon c2 = new Falcon(); //true
Falcon c3=new Bird(); //false
 Falcon c4=new Creature(); //false
Bird c5=new Falcon(); //true
Bird c6=new Creature();//false

}

}