/**
 * 
 */
package Chapter3Excercies;

import java.util.Random;

/**
 * @author sarthaksingh
 *
 */
public class TrigProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rand = new Random();

	        int num = rand.nextInt(20) + 20;

	        double sin = Math.sin(num);
	        double cos = Math.cos(num);
	        double tan = Math.tan(num);

	        System.out.println("The number is: " + num);
	        System.out.println("Sin: " + sin);
	        System.out.println("Cos: " + cos);
	        System.out.println("Tan: " + tan);
	}

}
