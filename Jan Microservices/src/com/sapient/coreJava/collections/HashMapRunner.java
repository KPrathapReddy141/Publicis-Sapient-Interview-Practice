package com.sapient.coreJava.collections;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HashMapRunner {

	public static void main(String[] args) {
		HashMapClass hmc = new HashMapClass(new HashMap<>());

		ExecutorService es = Executors.newFixedThreadPool(3);
		es.execute(() -> {
			for (int i = 1; i <= 10; i++) {
				hmc.m1(i, "thread1");
                 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		es.execute(() -> {
			for (int i = 1; i <= 10; i++) {

				hmc.m1(i, "thread2");

			}
		});
		;
		es.execute(() -> {
			for (int i = 1; i <= 10; i++) {
				hmc.m1(i, "thread3");
			}
		});
		es.shutdown();
		System.out.println(hmc.map);

	}
}
