package traits;
import static org.junit.Assert.*;

import org.junit.Test;

import elements.*;


public class TypeTest {

	@Test
	public void fireTest() {
		Fire typeA = new Fire();
		assertTrue(typeA.weakAgainst(new Ground().getElement()));
		assertFalse(typeA.strongAgainst(new Ghost().getElement()));
	}
	
	public void waterTest(){
		Water typeA = new Water();
		assertTrue(typeA.strongAgainst(new Rock().getElement()));
		assertTrue(typeA.weakAgainst(new Grass().getElement()));
	}
	
	public void fairyTest(){
		Fairy typeA = new Fairy();
		assertTrue(typeA.unaffectedBy(new Dragon().getElement()));
	}
	
	public void normalTest(){
		Normal typeA = new Normal();
		assertTrue(typeA.cantAffect(new Ghost().getElement()));
	}

}
