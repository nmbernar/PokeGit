package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import traits.Pokemon;
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

	private Element convertStringType(String type) {
		switch (type) {
		case "Bug":
			return Element.BUG;
		case "Dark":
			return Element.DARK;
		case "Dragon":
			return Element.DRAGON;
		case "Electric":
			return Element.ELECTRIC;
		case "Fairy":
			return Element.FAIRY;
		case "Fighting":
			return Element.FIGHTING;
		case "Fire":
			return Element.FIRE;
		case "Flying":
			return Element.FLYING;
		case "Ghost":
			return Element.GHOST;
		case "Grass":
			return Element.GRASS;
		case "Ground":
			return Element.GROUND;
		case "Ice":
			return Element.ICE;
		case "Normal":
			return Element.NORMAL;
		case "Poison":
			return Element.POISON;
		case "Psychic":
			return Element.PSYCHIC;
		case "Rock":
			return Element.ROCK;
		case "Steel":
			return Element.STEEL;
		case "Water":
			return Element.WATER;
		default:
			return null;
		}

	}
}
