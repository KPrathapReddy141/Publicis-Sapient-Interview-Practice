package ThreadsPractice;

public class NoramalThreadRunner {
	public static void main(String[] args) {
		NoramalThtreadClass ntc=new NoramalThtreadClass();
		NormalThreadObject ntb=new NormalThreadObject();
		ntc.setNormalThreadObject(ntb);
		new NoramalThtreadClass().setNormalThreadObject(ntb).run("thread1");
		new NoramalThtreadClass().setNormalThreadObject(ntb).run("thread2");
		ntc.run("thread3");
	}
}
