package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import exceptions.MoveDoesNotExistException;
import exceptions.PokemonDoesNotExistException;
import objects.Move;
import objects.Pokemon;
import objects.PokemonTeam;

/**
 * This class is used to represent the controller used to interface with the MySQL Database
 * @author Nicholli
 *
 */
public class PokeDBController {

	DatabaseConnect db = null;
	Connection connect = null;
	PreparedStatement stmt = null;

	public PokeDBController() {
		db = new DatabaseConnect();
		try {
			connect = DriverManager.getConnection(db.getURL(), db.getUsername(), db.getPass());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Gets a or multiple Pokemon searching based on name, and flags altform and legend
	 * @param name name of Pokemon to search for
	 * @param alt "Y" if include alternate forms in search, "N" to leave them out, blank for both
	 * @param legend "Y" if include legendaries in search, "N" to leave them out, blank for both
	 * @return a single Pokemon or a team of Pokemon
	 * @throws PokemonDoesNotExistException
	 */
	public Object getPokemonFromName(String name, String alt, String legend) throws PokemonDoesNotExistException {
		Pokemon poke = null;
		PokemonTeam team = new PokemonTeam();
		
		if(name.length() != 0) { name = '%'+name+'%'; }
		if(alt.length() != 0) { alt = '%'+alt; }
		if(legend.length() != 0) { legend = '%'+legend; }


		try {
			stmt = this.connect.prepareStatement("select * from pokemon.pokes where name like ? and altform like ? and legend like ?");
			stmt.setString(1, name);
			stmt.setString(2, alt);
			stmt.setString(3, legend);
			
			ResultSet result = stmt.executeQuery();
			
			//gets the number of rows in result
			int rows = 0;
			if(result.last()){
				rows = result.getRow();
				result.beforeFirst();
			}
			
			if(rows == 1){
				poke = new Pokemon(result);
				result.close();
				return poke;
			} else if(rows > 1){
				while(result.next()) {
					poke = new Pokemon(result);
					team.add(poke);
				}
				result.close();
				return team;
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Gets details about a Move given a string of the Move's name
	 * @param name Name of the desired Move
	 * @return Move object, containing details about the Move itself
	 * @throws MoveDoesNotExistException
	 */
	public Move getMoveFromName(String name) throws MoveDoesNotExistException {
		Move mv = null;
		
		try {
			stmt = this.connect.prepareStatement("select * from pokemon.moves where name = ?");
			stmt.setString(1, name);
			
			ResultSet result = stmt.executeQuery();
			
			mv = new Move(result);
			
			result.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return mv;
	}

}
