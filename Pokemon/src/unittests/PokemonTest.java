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
			Pokemon pika = (Pokemon) dbc.getPokemonFromName("Pikachu","N","N");
			
			assertNotNull(pika);
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testNotAPokemon() {
		Pokemon simpson = null;
		try {
			simpson = (Pokemon) dbc.getPokemonFromName("Simpson","","");
			
		} catch (PokemonDoesNotExistException e) {
			assertNull(simpson);
		}
	}

	@Test
	public void testGetName() {
		try {
			Pokemon tyrant = (Pokemon) dbc.getPokemonFromName("Tyranitar","N","N");
			
			assertEquals("Tyranitar", tyrant.getName());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetDexNumber() {
		try {
			Pokemon mew = (Pokemon) dbc.getPokemonFromName("mewtwo","N","Y");
			
			assertEquals(150, mew.getDexNumber());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetPrimaryType() {
		try {
			Pokemon fly = (Pokemon) dbc.getPokemonFromName("Flygon","N","N");
			
			assertEquals(Element.GROUND, fly.getPrimaryType());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetSecondaryType() {
		try {
			Pokemon murk = (Pokemon) dbc.getPokemonFromName("murkrow","N","N");
			
			assertEquals(Element.FLYING, murk.getSecondaryType());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetTotal() {
		try {
			Pokemon goo = (Pokemon) dbc.getPokemonFromName("Goodra","N","N");
			
			assertEquals(600, goo.getTotal());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetHp() {
		try {
			Pokemon oct = (Pokemon) dbc.getPokemonFromName("Octillery","N","N");
			
			assertEquals(75, oct.getHp());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAtt() {
		try {
			Pokemon nite = (Pokemon) dbc.getPokemonFromName("Dragonite","N","N");
			
			assertEquals(134, nite.getAtt());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetDef() {
		try {
			Pokemon golem = (Pokemon) dbc.getPokemonFromName("Golem","N","N");
			
			assertEquals(130, golem.getDef());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetSpatt() {
		try {
			Pokemon chand = (Pokemon) dbc.getPokemonFromName("Chandelure","N","N");
			
			assertEquals(145, chand.getSpatt());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetSpdef() {
		try {
			Pokemon del = (Pokemon) dbc.getPokemonFromName("Delphox","N","N");
			
			assertEquals(100, del.getSpdef());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetSpd() {
		try {
			Pokemon ferro = (Pokemon) dbc.getPokemonFromName("Ferrothorn","N","N");
			
			assertEquals(20, ferro.getSpd());
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

}
