package test.java;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import main.java.Menu;

public class TestMenu {
	@Test
	public void TesMenuNubemrOfOptions() {
		Menu menuTest = new Menu("Menu test", Arrays.asList("1", "2", "3"));
		
		assertTrue(menuTest.getNumberOfOptions()==3);
	}
	
}

