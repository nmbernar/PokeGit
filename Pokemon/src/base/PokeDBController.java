package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import traits.Pokemon;
import elements.*;
import traits.Type;
import traits.TypeSet;
import traits.Element;

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

			poke = this.resultSetPokemon(result);

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

	private Pokemon resultSetPokemon(ResultSet rs) throws SQLException {
		if (rs.next()) {
			return new Pokemon(rs.getString("name"), rs.getInt("dexnum"), this.convertStringType(rs.getString("ptype")),
					this.convertStringType(rs.getString("stype")), rs.getInt("total"), rs.getInt("hp"),
					rs.getInt("atk"), rs.getInt("def"), rs.getInt("spatk"), rs.getInt("spdef"), rs.getInt("spd"));
		}
		return null;
	}

	private Type convertStringType(String type) {
		switch (type) {
		case "Bug":
			return new Bug();
		case "Dark":
			return new Dark();
		case "Dragon":
			return new Dragon();
		case "Electric":
			return new Electric();
		case "Fairy":
			return new Fairy();
		case "Fighting":
			return new Fighting();
		case "Fire":
			return new Fire();
		case "Flying":
			return new Flying();
		case "Ghost":
			return new Ghost();
		case "Grass":
			return new Grass();
		case "Ground":
			return new Ground();
		case "Ice":
			return new Ice();
		case "Normal":
			return new Normal();
		case "Poison":
			return new Poison();
		case "Psychic":
			return new Psychic();
		case "Rock":
			return new Rock();
		case "Steel":
			return new Steel();
		case "Water":
			return new Water();
		default:
			return null;
		}

	}
}
