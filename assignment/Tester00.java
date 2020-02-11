public class Tester00 {
	 static int x = 4;
	public Tester00() {
		System.out.println(this.x);  
		Tester00(); 
		} public static void Tester00() { 
			System.out.println(this.x); 
}
		public static void main(String... args) { 
	new Tester00();
	}
		}

/* Output : Compile time error.....hint:Cannot use this in a static context   */