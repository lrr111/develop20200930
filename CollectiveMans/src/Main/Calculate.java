/**
 * 
 */
package Main;

/**
 * @author ASUS-PC
 *
 */
public class Calculate extends ABS_Calculate {

	/* (non-Javadoc)ASUS-PC下午12:00:57
	 * @see Main.ABS_Calculate#getResult(int, int, int, int, int, java.lang.String)
	 */
	ABS_Trapezoid trapezoid;
	public ABS_Trapezoid getTrapezoid() {
		return trapezoid;
	}
	public void setTrapezoid(ABS_Trapezoid trapezoid) {
		this.trapezoid = trapezoid;
	}
	@Override
	public double getResult(int length, int width, int height, int TopBottom, int Bottom, String op) {
		// TODO Auto-generated method stub
		if(op.equals("Trapezoid"))
			return trapezoid.Area(length, width, height, TopBottom, Bottom);
		else if(op.equals("Square"))
			return trapezoid.Area(length, width, height, TopBottom, Bottom);
		return Integer.MIN_VALUE;
	}
	

}
