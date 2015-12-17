package traits;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import elements.*;

public class TypeSetTest {

	@Test
	public void typeInSetTest() {
		TypeSet onlyFire = new TypeSet(Types.FIRE);
		assertTrue(onlyFire.typeInSet(Types.FIRE));
	}
	
	@Test
	public void typeNotInSetTest() {
		ArrayList<Type> test = new ArrayList<Type>();
		test.add(new Fire());
		test.add(new Water());
		test.add(new Ground());
		TypeSet FireWaterGround = new TypeSet(new ArrayList<Enum<Types>>(Arrays.asList(Types.FIRE, Types.WATER, Types.GROUND)));
		assertFalse(FireWaterGround.typeInSet(Types.GRASS));
	}
	
	@Test
	public void addTypeTest(){
		TypeSet empty = new TypeSet();
		empty.addType(Types.GRASS);
		assertTrue(empty.getTypes().contains(Types.GRASS));
		
		empty.addType(Types.DARK);
		assertTrue(empty.getTypes().contains(Types.GRASS));
		assertTrue(empty.getTypes().contains(Types.DARK));
	}
	
	@Test
	public void getTypeFromElementTest(){
		TypeSet empty = new TypeSet();
		assertEquals(empty.getTypeFromElement(Types.DRAGON).getElement(), new Dragon().getElement());
		
	}
	
	@Test
	public void getStrengthsTest(){
		TypeSet empty = new TypeSet();
		empty.addTypes(new Types[]{Types.DRAGON, Types.GHOST});
		TypeSet str = empty.getStrengths();
		assertTrue(empty.getTypes().contains(Types.DRAGON));
		assertTrue(str.getTypes().contains(Types.PSYCHIC));
		assertTrue(str.getTypes().contains(Types.GHOST));
		assertEquals(str.getTypes().size(), 3);
	}

}
