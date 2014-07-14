package traits;
import static org.junit.Assert.*;

import org.junit.Test;

import elements.*;


public class TypeTest {

	@Test
	public void fireTest() {
		Fire typeA = new Fire();
		assertTrue(typeA.weakAgainst(Types.GROUND));
		assertFalse(typeA.strongAgainst(Types.GHOST));
	}
	
	public void waterTest(){
		Water typeA = new Water();
		assertTrue(typeA.strongAgainst(Types.ROCK));
		assertTrue(typeA.weakAgainst(Types.GRASS));
	}
	
	public void fairyTest(){
		Fairy typeA = new Fairy();
		assertTrue(typeA.unaffectedBy(Types.DRAGON));
	}
	
	public void normalTest(){
		Normal typeA = new Normal();
		assertTrue(typeA.cantAffect(Types.GHOST));
	}

}
