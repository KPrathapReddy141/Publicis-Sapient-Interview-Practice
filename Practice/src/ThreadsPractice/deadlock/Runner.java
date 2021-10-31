package ThreadsPractice.deadlock;

public class Runner {

	public static void main(String[] args) {
		Object1 object1 = new Object1();
		Object2 object2 = new Object2();
		object1.setObject2(object2);
		object2.setObject2(object1);
		Thread1 thread1 = new Thread1(object1);
		Thread2 thread2 = new Thread2(object2);
		thread1.start();
		thread2.start();
	}
}
