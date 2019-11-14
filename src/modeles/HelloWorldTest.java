package modeles;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloWorldTest {
    private HelloWorld subject;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		subject = new HelloWorld();


	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMessage() {
		assertEquals("Hello World",( subject).getMessage(null) );
	}
	
	@Test
	public void testGetMessage2() {
		assertEquals("Hello franck",( subject).getMessage("franck") );
	}

	@Test
	public void testSum() {
		assertEquals(4,subject.sum(2, 2) );
	}

}
