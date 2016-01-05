package unittests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import objects.Type;
import objects.TypeSet;

public class TypeSetTest {

	@Test
	public void testTypeInSet() {
		TypeSet onlyFire = new TypeSet(Type.FIRE);
		assertTrue(onlyFire.contains(Type.FIRE));
	}
	
	@Test
	public void testTypeNotInSet() {
		TypeSet FireWaterGround = new TypeSet(new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.WATER, Type.GROUND)));
		assertFalse(FireWaterGround.contains(Type.GRASS));
	}
	
	@Test
	public void testAddType(){
		TypeSet empty = new TypeSet();
		empty.addType(Type.GRASS);
		assertTrue(empty.getTypes().contains(Type.GRASS));
		
		empty.addType(Type.DARK);
		assertTrue(empty.getTypes().contains(Type.GRASS));
		assertTrue(empty.getTypes().contains(Type.DARK));
	}
	
	@Test
	public void testGetStrengths(){
		TypeSet empty = new TypeSet();
		empty.addTypes(new ArrayList<>(Arrays.asList(Type.DRAGON, Type.GHOST)));
		TypeSet str = empty.getStrengths();
		assertTrue(empty.getTypes().contains(Type.DRAGON));
		assertTrue(str.getTypes().contains(Type.PSYCHIC));
		assertTrue(str.getTypes().contains(Type.GHOST));
		assertEquals(str.getTypes().size(), 3);
	}

}
