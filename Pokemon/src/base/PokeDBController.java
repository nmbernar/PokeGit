package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import objects.Pokemon;
import objects.TypeSet;

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

	public Pokemon getPokemonFromName(String name) {
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

	public TypeSet getStrengthsFromPokeTypes(ArrayList<Pokemon> pokes) {
		TypeSet types = new TypeSet();

		for (Pokemon p : pokes) {
			types.addTypes(p.getPrimaryType().getStrengths());
			if (p.getSecondaryType() != null)
				types.addTypes(p.getSecondaryType().getStrengths());
		}

		return types;
	}
}
