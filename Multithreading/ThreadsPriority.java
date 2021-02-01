package Multithreading;

public class ThreadsPriority  extends Thread{
	  
	      
	    public static void main(String args[])  
	    {    
	        // creating  threads   
	    	ThreadsPriority t1=new ThreadsPriority();    
	    	ThreadsPriority t2=new ThreadsPriority();  
	    	ThreadsPriority t3=new ThreadsPriority(); 
	        // set the priorities  for thread 
	        t1.setPriority(MAX_PRIORITY);  
	        t2.setPriority(MIN_PRIORITY);  
	        t3.setPriority(NORM_PRIORITY);
	        // print priority   and name
	        System.out.println("Priority of thread t1 is: " + t1.getPriority()); 
	        System.out.println("Name of thread is "+ t1.getName());
	        System.out.println("Priority of thread t2 is: " + t2.getPriority());
	        System.out.println("Name of thread is "+ t2.getName());
	        System.out.println("Priority of thread t3 is: " + t3.getPriority());
	        System.out.println("Name of thread is "+ t3.getName());
	        // run() method  call
	        t1.start();  
	    }  
	}  


