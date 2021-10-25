package com.sapient.coreJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UnThraedSafeCode implements Runnable {
	private int c = 0;

	public void increment() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		c++;
	}

	public void decrement() {

		c--;
	}

	public int get() {
		return c;
	}

	@Override
	public void run() {
		synchronized (this) {
			increment();
			System.out
					.println("after incermenting c is " + this.get() + " thread is" + Thread.currentThread().getName());
			decrement();
			System.out
					.println("after decermenting c is " + this.get() + " thread is" + Thread.currentThread().getName());

		}
	}

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		UnThraedSafeCode u1 = new UnThraedSafeCode();
		UnThraedSafeCode u2 = new UnThraedSafeCode();
		es.execute(u1);
		es.execute(u2);
		es.shutdown();

	}
}
