package objects;

import java.util.ArrayList;

/**
 * This class represents a grouping of Pokemon. <br>
 * This grouping does not care about order for equality sakes, and is maxed out at 6 Pokemon per Team.
 * @author Nicholli
 *
 */
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
	 * @return 0 if the team is full, -1 if the Pokemon is already on the team, and 1 if the add is successful
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
	 * Determines if the Pokemon Team already contains a given Pokemon
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
	
	/**
	 * Gets the Pokemon of the PokemonTeam in an ArrayList
	 * @return An ArrayList of the Pokemon of the PokemonTeam
	 */
	public ArrayList<Pokemon> getPokes(){
		return this.pokes;
	}
	
	/**
	 * Removes a Pokemon from the PokemonTeam.
	 * After removal, Pokemon still on the team are left shifted.
	 * @param poke Pokemon to be removed from the team.
	 * @return True if removal was successful, false if it was not successful.
	 */
	public boolean remove(Pokemon poke){
		if(pokes.size() == 0) { return false; }
		if(!this.contains(poke)) { return false; }
		
		int counter = 0;
		for(Pokemon teampoke : this.pokes) {
			if(teampoke.getName().equals(poke.getName())) {
				pokes.remove(counter);
			} else {
				counter++;
			}
		}
		
		return true;
	}
}
