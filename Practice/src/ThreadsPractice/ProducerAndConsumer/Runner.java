package ThreadsPractice.ProducerAndConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

	public static void main(String[] args) {
		ObjectClass ob=new ObjectClass();
	ExecutorService es=Executors.newFixedThreadPool(2);
	
	es.execute(()->{for (int i = 1; i <= 10; i++) {
		ob.producer(i);
	}});
	es.execute(()->{for (int i = 1; i <= 10; i++) {
		ob.consumer();
	}});
	es.shutdown();
	}
}
