package spring;

public class EmployeeBean {
	int eno;
	String name;
	Address addr;//injecting
	public EmployeeBean(int eno, String name, Address addr) {
		super();
		this.eno = eno;
		this.name = name;
		this.addr = addr;//dependent object
	}
	void show(){
		System.out.println("Employee Details: "+eno+" "+name);
		System.out.println(addr); //calls toString()
	}
}
