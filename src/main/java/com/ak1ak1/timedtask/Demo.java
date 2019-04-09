package com.ak1ak1.timedtask;

public class Demo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		test();
	}
	
	public static void test() throws InterruptedException{
		
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println("出错了");
			sleep(1000);
			test();
		}
		
	}
	
}
