package objects;

import java.sql.ResultSet;
import java.sql.SQLException;

import exceptions.PokemonDoesNotExistException;

public class Pokemon {
	private String name;
	private int dexNumber;
	private Type primaryType;
	private Type secondaryType;
	private int total;
	private int hp;
	private int att;
	private int def;
	private int spatt;
	private int spdef;
	private int spd;

	public Pokemon(ResultSet rs) throws PokemonDoesNotExistException{
		Type e = Type.NORMAL; //sample element, not used for any actual element comparison
		try {
			if(rs.next()){
				this.name = rs.getString("name");
				this.dexNumber = rs.getInt("dexnum");
				this.primaryType = e.getElementFromString(rs.getString("ptype"));
				this.secondaryType = e.getElementFromString(rs.getString("stype"));
				this.total = rs.getInt("total");
				this.hp = rs.getInt("hp");
				this.att= rs.getInt("atk");
				this.def = rs.getInt("def");
				this.spatt = rs.getInt("spatk");
				this.spdef = rs.getInt("spdef");
				this.spd = rs.getInt("spd");
				
			}
		} catch (SQLException ex) {
			throw new PokemonDoesNotExistException();
		}

	}

	public String getName() {
		return name;
	}

	public int getDexNumber() {
		return dexNumber;
	}

	public Type getPrimaryType() {
		return primaryType;
	}

	public Type getSecondaryType() {
		return secondaryType;
	}

	public int getTotal() {
		return total;
	}

	public int getHp() {
		return hp;
	}

	public int getAtt() {
		return att;
	}

	public int getDef() {
		return def;
	}

	public int getSpatt() {
		return spatt;
	}

	public int getSpdef() {
		return spdef;
	}

	public int getSpd() {
		return spd;
	}
}
