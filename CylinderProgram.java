/**
 * 
 */
package Chapter3Excercies;

import java.util.Random;

/**
 * @author sarthaksingh
 *
 */
public class CylinderProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rand = new Random();

        int r = rand.nextInt(20) + 1;
        int h = rand.nextInt(20) + 1;

        double v = Math.PI * Math.pow(r, 2) * h;
        double sa = Math.PI * 2 * r * h;

        System.out.println("The random r of the cylinder is:" + r + " The random h of the cylinder is " + h );
        System.out.println("The volume is: " + v + " and the surface area is: " + sa);
	}

}
