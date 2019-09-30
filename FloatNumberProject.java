/**
 * 
 */
package Chapter3Excercies;

import java.util.Scanner;

/**
 * @author sarthaksingh
 *
 */
public class FloatNumberProject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = (int) in.nextDouble();

        System.out.println(num + " is lower and " + (num + 1) + " is higher than your decimal");
	}

}
