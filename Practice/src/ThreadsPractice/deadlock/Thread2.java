package ThreadsPractice.deadlock;

public class Thread2 extends Thread {
	private Object2 object2=null;

	Thread2(Object2 object2) {
		this.object2 = object2;
	}

	@Override
	public void run() {
		object2.method1();
	}
}
