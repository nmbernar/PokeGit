package objects;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Pokemon {
	private String name;
	private int dexNumber;
	private Element primaryType;
	private Element secondaryType;
	private int total;
	private int hp;
	private int att;
	private int def;
	private int spatt;
	private int spdef;
	private int spd;

	public Pokemon(String name, int num, Element type1, Element type2, int total, int hp, int att, int def, int spatt,
			int spdef, int spd) {
		this.name = name;
		this.dexNumber = num;
		this.primaryType = type1;
		this.secondaryType = type2;
		this.total = total;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.spatt = spatt;
		this.spdef = spdef;
		this.spd = spd;
	}

	public Pokemon() {
	}

	public Pokemon(ResultSet rs){
		Element e = Element.NORMAL; //sample element, not used for any actual element comparison
		try {
			if(rs.next()){
				this.name = rs.getString("name");
				this.dexNumber = rs.getInt("dexnum");
				this.primaryType = e.getElementFromString(rs.getString("ptype"));
				this.secondaryType = e.getElementFromString(rs.getString("stype"));
				this.total = rs.getInt("total");
				this.hp = rs.getInt("hp");
				this.att= rs.getInt("att");
				this.def = rs.getInt("def");
				this.spatt = rs.getInt("spatt");
				this.spdef = rs.getInt("spdef");
				this.spd = rs.getInt("spd");
				
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDexNumber() {
		return dexNumber;
	}

	public void setDexNumber(int dexNumber) {
		this.dexNumber = dexNumber;
	}

	public Element getPrimaryType() {
		return primaryType;
	}

	public void setPrimaryType(Element primaryType) {
		this.primaryType = primaryType;
	}

	public Element getSecondaryType() {
		return secondaryType;
	}

	public void setSecondaryType(Element secondaryType) {
		this.secondaryType = secondaryType;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getSpatt() {
		return spatt;
	}

	public void setSpatt(int spatt) {
		this.spatt = spatt;
	}

	public int getSpdef() {
		return spdef;
	}

	public void setSpdef(int spdef) {
		this.spdef = spdef;
	}

	public int getSpd() {
		return spd;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}
}
