/**
 * 
 */
package Test01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.Calculate;
import Main.Square;
import Main.Trapezoid;

/**
 * @author ASUS-PC
 *
 */
class testTra {

	@Test
	void test() {
		Calculate c = new Calculate();
		c.setTrapezoid(new Square());
		double r = c.getResult(1, 2, 0, 0, 0, "Square");
		assertEquals(2,r);
	}

}
