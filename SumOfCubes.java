/**
 * 
 */
package Chapter3Excercies;
import java.util.Scanner;
/**
 * @author sarthaksingh
 *
 */
public class SumOfCubes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int side1;
		int side2;
		int side3;
		int sum;
		
		System.out.println("Enter a number: ");
		side1 = in.nextInt();
		
		System.out.println("Enter another number: ");
		side2 = in.nextInt();
		
		System.out.println("Enter one more number");
		side3 = in.nextInt();
		
		sum =  (int) (Math.pow(side1, 3) + Math.pow(side2, 3) + Math.pow(side3, 3));
		
		System.out.println("The sum of the cube of the numbers is " + sum);
	}

}
