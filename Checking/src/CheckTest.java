import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.*;
public class CheckTest {

	@Test
	/*public void test() {
		Check c=new Check();
		int a=5;
		int b=7;
		int expected=12;
		int value=c.sum(a,b);
		assertEquals(expected,value);
	}*/
	
	public void testString() {
		Check c=new Check();
		String a="LAMEez";
		String b="LAMEez";
		boolean value=c.checkString(a, b);
		assertEquals(value,true);
	}
	@Test
	public void test() {
		Check c=new Check();
		int a=5;
		int b=7;
		int expected=12;
		int value=c.sum(a,b);
		assertEquals(expected,value);
	}

}
