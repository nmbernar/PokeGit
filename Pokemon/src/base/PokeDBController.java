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

	public Pokemon getPokemonFromName(String name) throws PokemonDoesNotExistException {
		Pokemon poke = null;

		try {
			stmt = this.connect.prepareStatement("select * from pokemon.pokes where name = ?");
			stmt.setString(1, name);

			ResultSet result = stmt.executeQuery();

			poke = new Pokemon(result);

			result.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return poke;
	}

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
