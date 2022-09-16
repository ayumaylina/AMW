package asyncexample.asyncsimple;

public class MyThreadSecond extends Thread{
	 public void run() {
		    try {
		      for (int i=0; i<5; i++) {
		    	  sleep(1500);
		        System.out.println("Second Thread : in " +(i+1)+ " second ");
		        if (i != 4) {
		        	System.out.println();           
		        	sleep(3500);
		        } else {
			          System.out.println("Second Thread finish !!...\n");
		        }
		      }
		    } catch (InterruptedException ie) {
		      System.out.println(ie.getMessage());
		    }
		  }
}