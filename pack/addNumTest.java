package pack;

import static org.junit.Assert.*;

import org.junit.Test;

public class addNumTest {

	@Test
	public void test() {
		jUnitTesting junit = new jUnitTesting();
		int res = junit.addNum(1, 2);
		assertEquals (3,res);
	}

}
