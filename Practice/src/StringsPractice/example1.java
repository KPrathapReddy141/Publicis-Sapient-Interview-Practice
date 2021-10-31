package StringsPractice;

public class example1 {
	public example1(String ss, int n) {
		System.out.println(ss+n);
	}
	public int test() {
		try {
			int i=22/0;
			System.out.println(i);
		}catch(Exception e) {
			return 33;
		}
		finally {
			return 55;
		}
	}

	public static void main(String[] args) {

		/*
		 * boolean result =false; while(result) { System.out.println("hello"); }
		 * System.out.println("Ha");
		 */
		/*String s = "hai";
		String s2 = "hello";
		String s3 = s;
		System.out.println(s = s2);
		System.out.println(s3 == s2);*/
		
		example1 em = new example1("hello", 2);
		System.out.println(em.test());
		/*em=new example1("hi", 0);*/
		
		
		

		
		
	}
}
