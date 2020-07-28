package kosta.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void test() {
		String today=DateUtil.getCurrentDate();
		//assertNotNull(today);
		assertEquals("20200728",today);
	}

}
