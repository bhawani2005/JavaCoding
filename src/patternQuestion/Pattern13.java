/*
        * 
      *   
    *     
  *       
*         
 
 */
package patternQuestion;

public class Pattern13 {

	public static void main(String[] args) {
		int count=5;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==count) {
					System.out.print("* ");
					count--;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
