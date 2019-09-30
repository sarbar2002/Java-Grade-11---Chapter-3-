/**
 * 
 */
package Chapter3Excercies;

import java.util.Scanner;

/**
 * @author sarthaksingh
 *
 */
public class SphereArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);

	        System.out.print("Enter the radius of the sphere: ");
	        double radius = in.nextDouble();

	        double v = (4 / 3) * Math.PI * Math.pow(radius, 3);
	        double sa = 4 * Math.PI * Math.pow(radius, 2);

	        System.out.printf("The Volume is %.2f and the Surface Area is %.2f", v, sa);
	}

}
