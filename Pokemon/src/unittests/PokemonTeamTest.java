package unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import base.PokeDBController;
import exceptions.PokemonDoesNotExistException;
import objects.Pokemon;
import objects.PokemonTeam;

public class PokemonTeamTest {
	
	PokeDBController dbc;

	@Before
	public void setUp() throws Exception {
		dbc = new PokeDBController();
	}

	@Test
	public void testAdd() {
		Pokemon kadabra;
		try {
			kadabra = (Pokemon) dbc.getPokemonFromName("kadabra", "N", "N");
			
			PokemonTeam team = new PokemonTeam();
			team.add(kadabra);
			
			assertEquals(1, team.getPokes().size());
			assertEquals("Kadabra", team.getPokes().get(0).getName());
			
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void testAddWhenFull(){
		Pokemon kadabra;
		Pokemon ninjask;
		Pokemon alakazam;
		Pokemon voltorb;
		Pokemon charizard;
		Pokemon eevee;
		Pokemon mewtwo;
		
		PokemonTeam team = new PokemonTeam();
		
		try {
			kadabra = (Pokemon) dbc.getPokemonFromName("kadabra", "N", "N");
			ninjask = (Pokemon) dbc.getPokemonFromName("ninjask", "N", "N");
			alakazam = (Pokemon) dbc.getPokemonFromName("alakazam", "N", "N");
			voltorb = (Pokemon) dbc.getPokemonFromName("voltorb", "N", "N");
			charizard = (Pokemon) dbc.getPokemonFromName("charizard", "N", "N");
			eevee = (Pokemon) dbc.getPokemonFromName("eevee", "N", "N");
			mewtwo = (Pokemon) dbc.getPokemonFromName("mewtwo", "N", "Y");
			
			team.add(kadabra);
			team.add(ninjask);
			team.add(alakazam);
			team.add(voltorb);
			team.add(charizard);
			team.add(eevee);
			int check = team.add(mewtwo);
			
			assertEquals(0, check);
			assertFalse(team.contains(mewtwo));
			
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}

	}
	
	
	@Test
	public void testAddDuplicate(){
		Pokemon umbreon;
		
		PokemonTeam team = new PokemonTeam();
		
		try {
			umbreon = (Pokemon) dbc.getPokemonFromName("umbreon", "N", "N");
			
			team.add(umbreon);
			
			int check = team.add(umbreon);
			
			assertEquals(-1, check);
			assertEquals(1, team.getPokes().size());
			
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
		
		
	}

	@Test
	public void testContains() {
		Pokemon kadabra;
		try {
			kadabra = (Pokemon) dbc.getPokemonFromName("Kadabra", "N", "N");
			
			PokemonTeam team = new PokemonTeam();
			team.add(kadabra);
			
			assertTrue(team.contains(kadabra));
			
		} catch (PokemonDoesNotExistException e) {
			e.printStackTrace();
		}
	}

}
