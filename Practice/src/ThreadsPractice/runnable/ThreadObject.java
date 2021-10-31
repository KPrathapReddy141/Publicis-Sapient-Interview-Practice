package ThreadsPractice.runnable;

public class ThreadObject {
	int count = 0;
	public void method() {
		long start=System.currentTimeMillis();
		for (int i = 0; i <= 2000000000; i++) {		
		}
		long end=System.currentTimeMillis();
		System.out.println(count+". ."+(end-start));
	}
}
