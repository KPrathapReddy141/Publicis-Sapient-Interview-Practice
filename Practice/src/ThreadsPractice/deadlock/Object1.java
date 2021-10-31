package ThreadsPractice.deadlock;

public class Object1 {
	private Object2 object2;

	public void setObject2(Object2 object2) {
		this.object2 = object2;
	}

	public synchronized void method1() {
		System.out.println("object1 method1");
		object2.method2();
		
	}

	public synchronized void method2() {
		
		System.out.println("object1 method2");
	}
}
