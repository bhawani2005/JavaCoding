package lamdaExpression;

public class ThreadUsingLamdaExpression {
	public static void main(String[] args) {
//		Runnable r = ()->{
//			for(int i=0; i<=5; i++) {
//				System.out.println("Hello");
//			}
//		};
		
		Thread t1 = new Thread(()->{
			for(int i=0; i<=5; i++) {
				System.out.println("Hello");
			}
		});
		t1.start();
	}
}
