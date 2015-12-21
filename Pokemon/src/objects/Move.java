package objects;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Move {
	
	private String name;
	private Element type;
	private String category;
	private int power;
	private int acc;
	private int pp;
	private String descript;
	private int prob;
	private int priority;

	public Move() {
		
	}
	
	public Move(String name, Element type, String category, int power, int acc, int pp, String descript, int prob, int priority) {
		
	}
	
	public Move(ResultSet rs) {
		Element e = Element.NORMAL;
		
		try {
			if(rs.next()) {
				this.name = rs.getString("name");
				this.type = e.getElementFromString(rs.getString("type"));
				this.category = rs.getString("category");
				this.power = rs.getInt("power");
				this.acc = rs.getInt("acc");
				this.pp = rs.getInt("pp");
				this.descript = rs.getString("descript");
				this.prob = rs.getInt("prob");
				this.priority = rs.getInt("priority");
				
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Element getType() {
		return type;
	}

	public void setType(Element type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public int getProb() {
		return prob;
	}

	public void setProb(int prob) {
		this.prob = prob;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	
}
