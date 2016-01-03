package unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import base.PokeDBController;
import exceptions.PokemonDoesNotExistException;
import objects.Element;
import objects.Pokemon;

public class PokemonTest {
	
	PokeDBController dbc;

	@Before
	public void setUp() throws Exception {
		dbc = new PokeDBController();
	}

	@Test
	public void testPokemon() {
		try {
			Pokemon pika = dbc.getPokemonFromName("Pikachu");
			
			assertNotNull(pika);
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testNotAPokemon() {
		Pokemon simpson = null;
		try {
			simpson = dbc.getPokemonFromName("Simpson");
			
		} catch (PokemonDoesNotExistException e) {
			assertNull(simpson);
		}
	}

	@Test
	public void testGetName() {
		try {
			Pokemon tyrant = dbc.getPokemonFromName("Tyranitar");
			
			assertEquals("Tyranitar", tyrant.getName());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetDexNumber() {
		try {
			Pokemon mew = dbc.getPokemonFromName("Mew");
			
			assertEquals(151, mew.getDexNumber());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetPrimaryType() {
		try {
			Pokemon fly = dbc.getPokemonFromName("Flygon");
			
			assertEquals(Element.GROUND, fly.getPrimaryType());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetSecondaryType() {
		try {
			Pokemon murk = dbc.getPokemonFromName("murkrow");
			
			assertEquals(Element.FLYING, murk.getSecondaryType());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetTotal() {
		try {
			Pokemon goo = dbc.getPokemonFromName("Goodra");
			
			assertEquals(600, goo.getTotal());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetHp() {
		try {
			Pokemon oct = dbc.getPokemonFromName("Octillery");
			
			assertEquals(75, oct.getHp());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAtt() {
		try {
			Pokemon nite = dbc.getPokemonFromName("Dragonite");
			
			assertEquals(134, nite.getAtt());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetDef() {
		try {
			Pokemon golem = dbc.getPokemonFromName("Golem");
			
			assertEquals(130, golem.getDef());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetSpatt() {
		try {
			Pokemon chand = dbc.getPokemonFromName("Chandelure");
			
			assertEquals(145, chand.getSpatt());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetSpdef() {
		try {
			Pokemon del = dbc.getPokemonFromName("Delphox");
			
			assertEquals(100, del.getSpdef());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetSpd() {
		try {
			Pokemon ferro = dbc.getPokemonFromName("Ferrothorn");
			
			assertEquals(20, ferro.getSpd());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

}
