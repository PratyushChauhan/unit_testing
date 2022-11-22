package pack;

import static org.junit.Assert.*;

import org.junit.Test;

public class addStringTest {

	@Test
	public void test() {
		jUnitTesting junit = new jUnitTesting();
		String res = junit.addStrings("first", "second");
		assertEquals ("firstsecond",res);
	}

}
