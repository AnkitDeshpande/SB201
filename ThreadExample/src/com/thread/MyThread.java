package com.thread;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread A: " + i);
			try {
				Thread.sleep(2000); // Pause for 1 second
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
