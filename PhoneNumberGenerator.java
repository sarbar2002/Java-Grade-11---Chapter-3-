/**
 * 
 */
package Chapter3Excercies;
import java.util.Random;
/**
 * @author sarthaksingh
 *
 */
public class PhoneNumberGenerator {

	/**
	 * @param args
	 */ 
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int digit1 = rand.nextInt(8);
		int digit2 = rand.nextInt(556) + 100;
		int digit3 = rand.nextInt(9999) + 1000; 

		
		System.out.println( + digit1 + "" + digit1 + "" + "" + digit1 + "-" + digit2 +  "-" + digit3);
		

		
	}
		
	}

	