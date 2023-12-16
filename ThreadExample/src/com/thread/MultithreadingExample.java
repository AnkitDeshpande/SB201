package com.thread;

public class MultithreadingExample {
	public static void main(String args[]) {
		MyThread threadA = new MyThread();
		threadA.start(); // Start thread A

		// Main thread's task
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread: " + i);
			try {
				Thread.sleep(1000); // Pause for 1 second
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}