package zadanie2;

import java.util.Random;

public class Main {

	public static void main(String...strings ){
		
		
		
//		Random r = new Random();
//		Thread t1 = new Thread(){
//			@Override
//			public void run(){
//				
//				for(int i = 0; i < 10; i++){
//					System.out.println("t1: " + i);
//					try {
//						Thread.sleep(r.nextInt(2000));
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//						
//					}
//				}
//				
//			}
//		};
//		Thread t2 = new Thread(){
//			@Override
//			public void run(){
//				
//				for(int i = 0; i < 10; i++){
//					System.out.println("t2: " + i);
//					try {
//						Thread.sleep(r.nextInt(2000));
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					
//				}
//				
//			}
//		};
//		t1.start();
//		t2.start();
		
		MyClass runnableClass = new MyClass();
		Thread t3 = new Thread(runnableClass);
		t3.start();
		
		runnableClass.printInNewThread();
		
	}
	
}
