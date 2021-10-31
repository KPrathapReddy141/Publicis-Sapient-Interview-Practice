package ThreadsPractice.runnable;

public class ThreadClass implements Runnable {
	private ThreadObject object;
	ThreadClass(ThreadObject object){
		this.object=object;
	}
	@Override
	public void run() {
		object.method();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
