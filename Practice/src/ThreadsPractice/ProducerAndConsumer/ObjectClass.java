package ThreadsPractice.ProducerAndConsumer;

public class ObjectClass {
	boolean isAvilable=false;
	int num;
   
	synchronized public void producer(int n) {
     if(isAvilable) {
    	 try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
     }
     System.out.println(n);
     this.num=n;
     isAvilable=true;
     notifyAll();
	}

	synchronized public void consumer()  {
       if(!isAvilable) {
    	   try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       }
       
       System.out.println(num);
       
       isAvilable=false;
       notifyAll();
	}
}
