package vectorPrograms;

import java.util.Scanner;
import java.util.Vector;

public class RotationOfVectorByKthPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of K : ");
		int k = sc.nextInt();
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(1); v.add(2); v.add(3); v.add(4); v.add(5);
		
		for(int i=1; i<=k; i++) {
			v.addFirst(v.removeLast());
		}
		
		System.out.println(v);
	}
}
