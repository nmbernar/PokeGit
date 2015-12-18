package traits;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import elements.*;

public class TypeSetTest {

	@Test
	public void typeInSetTest() {
		TypeSet onlyFire = new TypeSet(Element.FIRE);
		assertTrue(onlyFire.typeInSet(Element.FIRE));
	}
	
	@Test
	public void typeNotInSetTest() {
		ArrayList<Type> test = new ArrayList<Type>();
		test.add(new Fire());
		test.add(new Water());
		test.add(new Ground());
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
	public void getTypeFromElementTest(){
		TypeSet empty = new TypeSet();
		assertEquals(empty.getTypeFromElement(Element.DRAGON).getElement(), new Dragon().getElement());
		
	}
	
	@Test
	public void getStrengthsTest(){
		TypeSet empty = new TypeSet();
		empty.addTypes(new Element[]{Element.DRAGON, Element.GHOST});
		TypeSet str = empty.getStrengths();
		assertTrue(empty.getTypes().contains(Element.DRAGON));
		assertTrue(str.getTypes().contains(Element.PSYCHIC));
		assertTrue(str.getTypes().contains(Element.GHOST));
		assertEquals(str.getTypes().size(), 3);
	}

}
