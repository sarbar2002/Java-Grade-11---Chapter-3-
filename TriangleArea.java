/**
 * 
 */
package Chapter3Excercies;

import java.util.Scanner;

/**
 * @author sarthaksingh
 *
 */
public class TriangleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        System.out.println("Please enter the sides of your triangle: ");

	        double a = in.nextInt();
	        double b = in.nextInt();
	        double c = in.nextInt();

	        double s = (a + b + c) / 2;

	        double form = s * (s - a) * (s - b) * (s - c);

	        double area = Math.sqrt(form);

	        System.out.println("The area of this triangle is " + area);
	}

}
