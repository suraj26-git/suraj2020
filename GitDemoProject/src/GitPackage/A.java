package GitPackage;

public class A {
	
	public void sum() {
		System.out.println("sum==A");
	}
	public void sub() {
		System.out.println("sub==A");
	}
	public static void main(String[] args) {
		System.out.println("Hello...");
		
	 A a= new A();
           a.sum();
	   a.sub();
	}

}
