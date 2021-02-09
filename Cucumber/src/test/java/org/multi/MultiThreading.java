package org.multi;

public class MultiThreading extends Thread {
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Welcome");
			
		}
		
		super.run();
	}

}
