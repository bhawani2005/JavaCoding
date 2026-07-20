package vectorPrograms;

public class WrapperClassDemo {
	public static void main(String[] args) {
		int a = 10;
		//Integer b = new Integer(a);
		
		Integer b = 20; // AutoBoxing
		//int c = (int)b;
		int c = b; // AutoUnboxing
		
		System.out.println(c);
		
		String s = "123";
		int num = Integer.parseInt(s);
	}
}
