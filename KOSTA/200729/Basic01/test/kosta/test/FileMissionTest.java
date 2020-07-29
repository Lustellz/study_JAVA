package kosta.test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileMissionTest {

	@Test
	public void testSearch() {
		String path = "C:\\rg\\workspace\\Servers";
		File file = new File(path);
		File files[] = file.listFiles();
		assertNotNull(files[0]);
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

}
