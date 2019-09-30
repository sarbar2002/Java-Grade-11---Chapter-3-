/**
 * 
 */
package Chapter3Excercies;

import java.util.Scanner;

/**
 * @author sarthaksingh
 *
 */
public class DistanceFormula {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner input = new Scanner(System.in);

	        System.out.print("Please enter an x1: ");
	        int x1 = input.nextInt();
	        System.out.print(" Please enter an y1: ");
	        int y1 = input.nextInt();
	        System.out.print(" Please enter an x2: ");
	        int x2 = input.nextInt();
	        System.out.print(" Please enter an y2: ");
	        int y2 = input.nextInt();

	        double inside = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);

	        double distance = Math.sqrt(inside);

	        System.out.println("The distance is " + distance);
	}

}
