package unittests;
import static org.junit.Assert.*;

import org.junit.Test;

import objects.Type;


public class TypeTest {

	@Test
	public void testFire() {
		Type fire = Type.FIRE;
		assertTrue(fire.getStrengths().getTypes().contains(Type.ICE));
		assertFalse(fire.getWeaknesses().getTypes().contains(Type.DARK));
	}
	
	
	public void testGhost(){
		Type ghost = Type.GHOST;
		assertTrue(ghost.getStrengths().getTypes().contains(Type.PSYCHIC));
		assertTrue(ghost.getUnaffected().getTypes().contains(Type.NORMAL));
		assertFalse(ghost.getWeaknesses().getTypes().contains(Type.FIGHTING));
	}

	public void testPsychic(){
		Type psychic = Type.PSYCHIC;
		assertTrue(psychic.getStrengths().getTypes().contains(Type.BUG));
		assertFalse(psychic.getWeaknesses().getTypes().contains(Type.WATER));
		assertTrue(psychic.getCantAffect().getTypes().contains(Type.DARK));
	}
}
