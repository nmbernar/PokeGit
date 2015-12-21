package unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import base.PokeDBController;
import objects.Move;

public class MoveTest {
	
	PokeDBController dbc = null;

	@Before
	public void setUp() throws Exception {
		dbc = new PokeDBController();
	}

	@Test
	public void testMove() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveStandardConstructor() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveResultSet() {
		Move flamethrower = dbc.getMoveFromName("flamethrower");
		assertNotNull(flamethrower);
		assertEquals(flamethrower.getName(), "Flamethrower");
		assertEquals(flamethrower.getPower(), 90);
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetType() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetType() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCategory() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCategory() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPower() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPower() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAcc() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAcc() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPp() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPp() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDescript() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDescript() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProb() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetProb() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPriority() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPriority() {
		fail("Not yet implemented");
	}

}
