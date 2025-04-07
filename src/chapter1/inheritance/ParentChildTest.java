package chapter1.inheritance;

public class ParentChildTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.name);
		p.greet();
		
		System.out.println("==========");
		Child c = new Child();
		System.out.println(c.name);
		c.greet();
		
		
		System.out.println("==========");
		GrandChild gc = new GrandChild();
		System.out.println(gc.name);
		gc.greet();
		
		System.out.println("==========");
		Child2 c2 = new Child2();
		System.out.println(c2.name);
		c2.greet();
	}

}
