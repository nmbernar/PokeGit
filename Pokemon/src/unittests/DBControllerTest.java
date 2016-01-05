package unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import base.PokeDBController;
import exceptions.MoveDoesNotExistException;
import exceptions.PokemonDoesNotExistException;
import objects.Element;
import objects.Move;
import objects.Pokemon;

public class DBControllerTest {

	PokeDBController dbc;
	
	@Before
	public void setUp() throws Exception {
		dbc = new PokeDBController();
	}

	@Test
	public void testGetPokemonFromName() {
		try {
			Pokemon chomp = (Pokemon) dbc.getPokemonFromName("Garchomp","N","N");
			
			assertNotNull(chomp);
			assertEquals("Garchomp", chomp.getName());
			assertEquals(Element.DRAGON, chomp.getPrimaryType());
			
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void testGetPokemonFromNoName() {
		Pokemon empty = null;
		try {
			empty = (Pokemon) dbc.getPokemonFromName("","","");
			
		} catch (PokemonDoesNotExistException e) {
			assertNull(empty);
		}
	
	}

	@Test
	public void testGetMoveFromName() {
		try {
			Move dd = dbc.getMoveFromName("Dragon Dance");
			Move ft = dbc.getMoveFromName("flamethrower");
			
			assertNotNull(dd);
			assertNotNull(ft);
			assertEquals("Dragon Dance", dd.getName());
			assertEquals("Flamethrower", ft.getName());
			assertEquals(0, dd.getPower());
			assertEquals(90, ft.getPower());
			
		} catch (MoveDoesNotExistException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testGetMoveFromNoName() {
		Move empty = null;
		try {
			empty = dbc.getMoveFromName("");
			
		} catch (MoveDoesNotExistException e) {
			assertNull(empty);
		}
		
	}

}
