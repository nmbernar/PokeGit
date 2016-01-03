package objects;

import java.sql.ResultSet;
import java.sql.SQLException;

import exceptions.MoveDoesNotExistException;

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
	
	public Move(ResultSet rs) throws MoveDoesNotExistException {
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
			throw new MoveDoesNotExistException();
		}
	}

	public String getName() {
		return name;
	}

	public Element getType() {
		return type;
	}

	public String getCategory() {
		return category;
	}

	public int getPower() {
		return power;
	}

	public int getAcc() {
		return acc;
	}

	public int getPp() {
		return pp;
	}

	public String getDescript() {
		return descript;
	}

	public int getProb() {
		return prob;
	}

	public int getPriority() {
		return priority;
	}
	
}
