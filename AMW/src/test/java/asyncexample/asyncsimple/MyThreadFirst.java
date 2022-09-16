package asyncexample.asyncsimple;

public class MyThreadFirst extends Thread{

	public void run() {
	    try {
	      for (int i=0; i<10; i++) {
	    	  sleep(3000);
	        System.out.println("First Thread in " +(i+1)+" second ");
	        if (i != 9) {
	        	sleep(5000);
	        } else {
	          System.out.println("First Thread finish !!...\n");
	        }
	      }
	    } 
	    catch (InterruptedException ie) 
	    {
	      System.out.println(ie.getMessage());
	    }
	  }
}