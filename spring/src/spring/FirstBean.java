package spring;

public class FirstBean {

	String name;
	public void setName(String name){
		this.name=name;
	}
	public void display(){
		System.out.println("Welocme Spring: "+name);
	}
}
