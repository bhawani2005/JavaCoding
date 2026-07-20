package string;

public class ReverseStringWithInPlace {
	public static void main(String[] args) {
		
		String s = "Hello Everyone";
		
		String str[] = s.split(" ");
		
		for(int i=0; i<str.length; i++) {
			str[i] = reverse(str[i]);
		}
		
		String result = "";
		
		for(String e : str) {
			result += e+" ";
		}
		
		System.out.println("Given String is : "+s);
		System.out.println("Reverse String is : "+result);
	}
	
	public static String reverse(String str) {
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		
		return rev;
	}
}
