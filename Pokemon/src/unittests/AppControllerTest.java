package unittests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import base.PokeAppController;
import base.PokeDBController;
import exceptions.PokemonDoesNotExistException;
import objects.Element;
import objects.Pokemon;
import objects.TypeSet;

public class AppControllerTest {

	PokeDBController dbc;
	
	@Before
	public void setUp() throws Exception {
		dbc = new PokeDBController();
	}

	@Test
	public void testGetStrengthsFromPokeTypes() {
		ArrayList<Pokemon> pokes = new ArrayList<Pokemon>();
		PokeAppController pac = new PokeAppController();
		
		try {
			pokes.add(dbc.getPokemonFromName("Charizard"));
			pokes.add(dbc.getPokemonFromName("Raichu"));
			pokes.add(dbc.getPokemonFromName("Lapras"));
			
			TypeSet str = pac.getStrengthsFromPokeTypes(pokes);
			
			assertTrue(str.equals(new TypeSet(new ArrayList<>(Arrays.asList(Element.GRASS, 
					Element.BUG, Element.STEEL, Element.ICE, Element.FIGHTING, 
					Element.WATER, Element.FLYING, Element.ROCK, Element.GROUND, 
					Element.FIRE, Element.DRAGON)))));
			
		} catch (PokemonDoesNotExistException e) {
			
			e.printStackTrace();
		}

	}

}
