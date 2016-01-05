package unittests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import objects.Type;
import objects.TypeSet;

public class TypeSetTest {

	@Test
	public void testContains() {
		TypeSet onlyFire = new TypeSet(Type.FIRE);
		assertTrue(onlyFire.contains(Type.FIRE));
	}
	
	@Test
	public void testDoesNotContain() {
		TypeSet FireWaterGround = new TypeSet(new ArrayList<Type>(Arrays.asList(Type.FIRE, Type.WATER, Type.GROUND)));
		assertFalse(FireWaterGround.contains(Type.GRASS));
	}
	
	@Test
	public void testEmptyDoesNotContain() {
		TypeSet empty = new TypeSet();
		assertFalse(empty.contains(Type.GHOST));
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
	
	@Test
	public void testEquals() {
		TypeSet grdFireDragWater = new TypeSet(new ArrayList<>(Arrays.asList(Type.GROUND, Type.FIRE, Type.DRAGON, Type.WATER)));
		TypeSet fireDragWaterDrg = new TypeSet(new ArrayList<>(Arrays.asList(Type.FIRE, Type.DRAGON, Type.WATER, Type.GROUND)));
		
		assertTrue(grdFireDragWater.equals(fireDragWaterDrg));
	}
	
	@Test
	public void testSizeDoesNotEqual() {
		TypeSet grassBug = new TypeSet(new ArrayList<>(Arrays.asList(Type.GRASS, Type.BUG)));
		TypeSet grass = new TypeSet(new ArrayList<>(Arrays.asList(Type.GRASS)));
		
		assertFalse(grassBug.equals(grass));
	}
	
	@Test
	public void testEmptyEquals() {
		TypeSet empty1 = new TypeSet();
		TypeSet empty2 = new TypeSet();
		
		assertTrue(empty1.equals(empty2));
	}

}
