	/**
 * 
 */
package Chapter3Excercies;

import java.util.Random;
import java.util.Scanner;

/**
 * @author sarthaksingh
 *
 */
public class FirstAndLast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	        Random rand = new Random();

	        System.out.print("Please enter your first name: ");
	        String first = input.next();

	        System.out.print(" Please enter your last name: ");
	        String last = input.next();

	        System.out.println(first.charAt(0) + last.substring(0, 5) + (rand.nextInt(90) + 10));
	}

}
