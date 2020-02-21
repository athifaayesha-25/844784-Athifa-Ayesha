import java.util.ArrayList;
//definition of a collection
//collections are used to work with object
class Employee{
int id;
//String name;
double salary;
Employee(int id,String name){
	this.id=id;
	this.salary=salary;
}
public String toString(){
	return "Employee: ["+ this.id+" "+this.salary+"]";
}
}

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		//obj.add(2);
		//obj.add(1);
		Employee e1=new Employee(1234,"34000.0");
		Employee e2=new Employee(1235,"2000.0");
		//obj.add(e1);
		//obj.add(e2);
		//obj.add("apple");
		//obj.add("abc");
		//for(String i:obj)
		//{
			//System.out.println(i);
		//}
		/*Employee e3=e1;
				//e1=null;
		//System.out.println(e1);
		//System.out.println(e1.toString());*/
		
		System.out.println("program ends here");
	}

}
