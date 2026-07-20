package vectorPrograms;

import java.util.Vector;

public class ReverseAVector {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(1); v1.add(2); v1.add(3); v1.add(2);
		
		//Collections.reverse(v1);
		
		int left = 0;
		int right = v1.size()-1;
		
		while(left<=right) {
			
			Integer temp = v1.get(left);
			v1.set(left, v1.get(right));
			v1.set(right, temp);
			
			left++;
			right--;
		}
		
		System.out.println(v1);
	}
}
