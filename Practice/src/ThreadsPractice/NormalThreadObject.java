package ThreadsPractice;

public class NormalThreadObject {
	long time = 0;
	void method(String s) {

		Long start = System.currentTimeMillis();
		try {
			System.out.println(s);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "::" + s);
		}
		Long end = System.currentTimeMillis();
		Long total = end - start;
		time = time + total;
		System.out.println(time + "::" + s);
	}
}
