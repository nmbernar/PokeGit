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
		try {
			Move aa = dbc.getMoveFromName("Acid Armor");
			Move ac = dbc.getMoveFromName("Air Cutter");
			
			assertEquals(0, aa.getAcc());
			assertEquals(95, ac.getAcc());
		} catch (MoveDoesNotExistException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testGetPp() {
		try {
			Move mr = dbc.getMoveFromName("Mind Reader");
			Move ms = dbc.getMoveFromName("Mirror shot");
			
			assertEquals(5, mr.getPp());
			assertEquals(10, ms.getPp());
		} catch (MoveDoesNotExistException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testGetDescript() {
		try {
			Move pw = dbc.getMoveFromName("Power Whip");
			Move qa = dbc.getMoveFromName("Quick Attack");
			
			assertEquals("", pw.getDescript());
			assertEquals("User attacks first.", qa.getDescript());
		} catch (MoveDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetProb() {
		try {
			Move ib = dbc.getMoveFromName("Ice beam");
			Move tw = dbc.getMoveFromName("thunder wave");
			Move td = dbc.getMoveFromName("Take Down");
			
			assertEquals(10, ib.getProb());
			assertEquals(100, tw.getProb());
			assertEquals(0, td.getProb());
			
		} catch (MoveDoesNotExistException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Data not yet added into the database
	 */
	@Test
	public void testGetPriority() {
		fail("Not yet implemented");
	}
}
