package ThreadsPractice.deadlock;

public class Thread1 extends Thread {
	private Object1 object1 = null;

	Thread1(Object1 object1) {
		this.object1 = object1;
	}

	@Override
	public void run() {
		object1.method1();
	}

}
