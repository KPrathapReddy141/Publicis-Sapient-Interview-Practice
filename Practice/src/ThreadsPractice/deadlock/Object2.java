package ThreadsPractice.deadlock;

public class Object2 {
	private Object1 object1;

	public void setObject2(Object1 object1) {
		this.object1 = object1;
	}

	public synchronized void method1() {
		System.out.println("object2 method1");
		object1.method2();
		
	}

	public synchronized void method2() {
		System.out.println("object2 method2");
		
		

	}
}
