package com.ibm.threads;
public class Application {
	public static void workload() {
		for(int current=0;current<10;current++) {
       	 System.out.println(Thread.currentThread()+"---"+current);
        }
	}
  public static void main(String[] args) {
	Thread thread1=new Thread(() ->workload());
	System.out.println(thread1.getState());
	thread1.start();
	System.out.println(thread1.getState());
	try {
		Thread.sleep(100);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(thread1.getState());
}
}
