import static org.junit.Assert.*;
import org.junit.Test;

public class mathlibtest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public void addtest() {
		mathlib obj = new mathlib();
		assert(10 == obj.add(6,4));
	}
	
	public void subtest() {
		mathlib obj = new mathlib();
		assert(2 == obj.subtract(6,4));
	}
	public void multest() {
		mathlib obj = new mathlib();
		assert(24 == obj.multiply(6,4));
	}
	public void dividetest() {
		mathlib obj = new mathlib();
		assert(0.8== obj.add(4,5));
	}
	

}
