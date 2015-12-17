package traits;
import static org.junit.Assert.*;

import org.junit.Test;


public class TypeTest {

	@Test
	public void fireTest() {
		Element fire = Element.FIRE;
		assertTrue(fire.getStrengths().getTypes().contains(Element.ICE));
		assertFalse(fire.getWeaknesses().getTypes().contains(Element.DARK));
	}
	
	
	public void ghostTest(){
		Element ghost = Element.GHOST;
		assertTrue(ghost.getStrengths().getTypes().contains(Element.PSYCHIC));
		assertTrue(ghost.getUnaffected().getTypes().contains(Element.NORMAL));
		assertFalse(ghost.getWeaknesses().getTypes().contains(Element.FIGHTING));
	}

	public void psychicTest(){
		Element psychic = Element.PSYCHIC;
		assertTrue(psychic.getStrengths().getTypes().contains(Element.BUG));
		assertFalse(psychic.getWeaknesses().getTypes().contains(Element.WATER));
		assertTrue(psychic.getCantAffect().getTypes().contains(Element.DARK));
	}
}
