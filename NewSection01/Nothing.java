package NewSection01;

public class Nothing {
	static void m1() {
		System.out.println("m1");
		
	}
	void m2() {
		m1();
		System.out.println("m2");
	}
	static void m3() {
		Nothing n= new Nothing(); 
		n.m2();
		System.out.println("m3");
	}
public static void main(String[] args) {
	
	m3();
	
}
}
