package unittests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import objects.Element;
import objects.TypeSet;

public class TypeSetTest {

	@Test
	public void typeInSetTest() {
		TypeSet onlyFire = new TypeSet(Element.FIRE);
		assertTrue(onlyFire.typeInSet(Element.FIRE));
	}
	
	@Test
	public void typeNotInSetTest() {
		TypeSet FireWaterGround = new TypeSet(new ArrayList<Element>(Arrays.asList(Element.FIRE, Element.WATER, Element.GROUND)));
		assertFalse(FireWaterGround.typeInSet(Element.GRASS));
	}
	
	@Test
	public void addTypeTest(){
		TypeSet empty = new TypeSet();
		empty.addType(Element.GRASS);
		assertTrue(empty.getTypes().contains(Element.GRASS));
		
		empty.addType(Element.DARK);
		assertTrue(empty.getTypes().contains(Element.GRASS));
		assertTrue(empty.getTypes().contains(Element.DARK));
	}
	
	@Test
	public void getStrengthsTest(){
		TypeSet empty = new TypeSet();
		empty.addTypes(new TypeSet(new ArrayList<>(Arrays.asList(Element.DRAGON, Element.GHOST))));
		TypeSet str = empty.getStrengths();
		assertTrue(empty.getTypes().contains(Element.DRAGON));
		assertTrue(str.getTypes().contains(Element.PSYCHIC));
		assertTrue(str.getTypes().contains(Element.GHOST));
		assertEquals(str.getTypes().size(), 3);
	}

}
