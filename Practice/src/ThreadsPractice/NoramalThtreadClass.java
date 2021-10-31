package ThreadsPractice;

public class NoramalThtreadClass extends Thread {
	private NormalThreadObject object;
	public NoramalThtreadClass setNormalThreadObject(NormalThreadObject object) {
	this.object=object;
	return this;
	}

	public void run(String s) {
		object.method(s);
	}
	
}
