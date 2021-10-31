package ThreadsPractice.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

	public static void main(String[] args) {
		ThreadObject th=new ThreadObject();
		ThreadClass t1=new ThreadClass(th);
		ThreadClass t2=new ThreadClass(th);
		ExecutorService exe = Executors.newFixedThreadPool(2);
		exe.execute(t1);
		exe.execute(t2);
		exe.shutdown();
	}
}
