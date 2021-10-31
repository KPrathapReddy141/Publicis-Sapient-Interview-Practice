package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPracRun{

	public  static void main(String[] args) {
		ThraedClass th=new ThraedClass();
		ExecutorService ex=Executors.newFixedThreadPool(3);
		ex.execute(th);
		ex.execute(th);
		ex.execute(th);
		ex.shutdown();
	}

}
