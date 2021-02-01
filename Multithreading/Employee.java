package Multithreading;

import java.util.HashMap;
import java.util.Map;

class EmployeeIDName implements Runnable{
	public void run() {
        System.out.println("Employee name and id");
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        //Adding elements to HashMap
        hmap.put(11, "AB");
        hmap.put(2, "CD");
        hmap.put(33, "EF");
        hmap.put(9, "GH");
        hmap.put(3, "IJ");
        
        for (Map.Entry me : hmap.entrySet()) {
          System.out.println("Id: "+me.getKey() + " & Name: " + me.getValue());
        }     
    }
  }

class EmployeeIdEmail implements Runnable{
	 
    public void run() {
    	System.out.println("Employee Id and Email");
        HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
        //Adding elements to HashMap
        hmap1.put(11, "ab@gmail.com");
        hmap1.put(2, "cd@gmail.com");
        hmap1.put(33, "ef@gmail.com");
        hmap1.put(9, "gh@gmail.com");
        hmap1.put(3, "ij@gmail.com");
        
        //Print the hashmap using for key and value
        for (Map.Entry me : hmap1.entrySet()) {
          System.out.println("ID: "+me.getKey() + " & Email: " + me.getValue());
        }
    }
}

public class Employee {
	 
    public static void main(String[] args) {
        Runnable runnable=new EmployeeIDName();
        //Runnable to constructor of thread class
        Thread t=new Thread(runnable);
        t.run();
        
       //Runnable to constructor of thread class
        Runnable runnable1=new EmployeeIdEmail();
        //thread creation
        Thread t1=new Thread(runnable1);
        t1.start();
    }
}
 