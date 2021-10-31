package Threads;

public class ThraedClass implements Runnable   {

	

	@Override
	public void run() {
		Long start = System.currentTimeMillis();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hello");
		Long end = System.currentTimeMillis();
		System.out.println(end - start);
		
	}

}
