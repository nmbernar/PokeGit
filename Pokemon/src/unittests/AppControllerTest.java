package unittests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import base.PokeAppController;
import base.PokeDBController;
import exceptions.PokemonDoesNotExistException;
import objects.Type;
import objects.Pokemon;
import objects.PokemonTeam;
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
			Pokemon zard = dbc.getPokemonFromName("Charizard","N","N").getFirst();
			Pokemon chu = dbc.getPokemonFromName("Raichu","N","N").getFirst();
			Pokemon lap = dbc.getPokemonFromName("Lapras","N","N").getFirst();
			
			pokes.add(zard);
			pokes.add(chu);
			pokes.add(lap);
			
			TypeSet str = pac.getStrengthsFromPokeTypes(pokes);
			
			assertTrue(str.equals(new TypeSet(new ArrayList<>(Arrays.asList(Type.GRASS, 
					Type.BUG, Type.STEEL, Type.ICE, Type.FIGHTING, 
					Type.WATER, Type.FLYING, Type.ROCK, Type.GROUND, 
					Type.FIRE, Type.DRAGON)))));
			
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void testGetStrengthsFromEmptyPokesTypes() {
		ArrayList<Pokemon> pokes = new ArrayList<Pokemon>();
		PokeAppController pac = new PokeAppController();
		
		TypeSet str = pac.getStrengthsFromPokeTypes(pokes);
		
		assertTrue(str.equals(new TypeSet()));
		
	}

}
