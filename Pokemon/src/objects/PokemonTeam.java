package objects;

import java.util.ArrayList;

public class PokemonTeam {

	private ArrayList<Pokemon> pokes = new ArrayList<Pokemon>(6);
	
	/**
	 * A set of unique Pokemon limited to six
	 */
	public PokemonTeam(){
		
	}
	
	/**
	 * Adds a Pokemon to the PokemonTeam
	 * @param poke to be added
	 * @return 0 if the team is full, -1 if the pokemon is already on the team, and 1 if the add is successful
	 */
	public int add(Pokemon poke){
		if(pokes.size() >= 6){
			return 0;
		}
		
		if(this.contains(poke)){
			return -1;
		}
		
		pokes.add(poke);
		return 1;

	}
	
	/**
	 * Determines if the Pokemon Team already contains a given pokemon
	 * @param poke to check if it is in the team
	 * @return False if it isn't on the team, True if it is.
	 */
	public boolean contains(Pokemon poke){
		for(Pokemon teamPoke : this.pokes) {
			if(teamPoke.getName().equals(poke.getName())){
				return true;
			}
		}
		
		return false;
	}
	
	public ArrayList<Pokemon> getPokes(){
		return this.pokes;
	}
}
