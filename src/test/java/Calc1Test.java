



import static org.junit.Assert.*;

import org.junit.Test;




public class Calc1Test {

	@Test
	public void testAdd(){
		Calc1 calc = new Calc1();
		calc.add(10, 20);
		assertEquals(30,calc.getResult());
	}
	
	@Test
	public void testSub(){
		Calc1 calc = new Calc1();
		calc.sub(10, 20);
		assertEquals(-10,calc.getResult());
	}
	
}
