package asyncexample.asyncsimple;

public class ImplementsMultiThread {

	
		  public static void main(String[] args) {

		    MyThreadFirst t1 = new MyThreadFirst();
		    t1.start();

		    MyThreadSecond t2 = new MyThreadSecond();
		    t2.start();
		  }
}