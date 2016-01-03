package unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import base.PokeDBController;
import exceptions.MoveDoesNotExistException;
import objects.Element;
import objects.Move;

public class MoveTest {
	
	PokeDBController dbc = null;

	@Before
	public void setUp() throws Exception {
		dbc = new PokeDBController();
	}
	
	@Test
	public void testMoveResultSetConstructor() {
		try {
			Move flamethrower = dbc.getMoveFromName("flamethrower");
			assertNotNull(flamethrower);
			assertEquals("Flamethrower", flamethrower.getName());
			assertEquals(flamethrower.getPower(), 90);
		} catch(MoveDoesNotExistException e) {
			System.out.println(e.getMessage());
		}
	}

	
	@Test
	public void testGetName() {
		try {
			Move flamethrower = dbc.getMoveFromName("flamethrower");
			assertEquals("Flamethrower", flamethrower.getName());
		} catch (MoveDoesNotExistException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testGetType() {
		try {
			Move bubble = dbc.getMoveFromName("Bubble");
			assertEquals(Element.WATER, bubble.getType());
		} catch (MoveDoesNotExistException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testGetCategory() {
		try {
			Move bubble = dbc.getMoveFromName("Bubble");
			Move es = dbc.getMoveFromName("Extreme Speed");
			Move cray = dbc.getMoveFromName("Confuse Ray");
			assertEquals("Special", bubble.getCategory());
			assertEquals("Physical", es.getCategory());
			assertEquals("Status", cray.getCategory());
		} catch (MoveDoesNotExistException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testGetPower() {
		try {
			Move es = dbc.getMoveFromName("Extreme Speed");
			Move cray = dbc.getMoveFromName("Confuse Ray");
			
			assertEquals(80, es.getPower());
			assertEquals(0, cray.getPower());
		} catch (MoveDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAcc() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPp() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDescript() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProb() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPriority() {
		fail("Not yet implemented");
	}
}
