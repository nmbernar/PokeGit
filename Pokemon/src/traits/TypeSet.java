package traits;

import java.util.ArrayList;
import java.util.List;
import elements.*;

public class TypeSet {

	private ArrayList<Enum<Types>> types = new ArrayList<Enum<Types>>();

	/**
	 * Initializes set with no types
	 */
	public TypeSet() {

	}

	/**
	 * Initializes set with one type
	 * 
	 * @param type
	 */
	public TypeSet(Enum<Types> type) {
		types.add(type);
	}

	/**
	 * Initializes set with a TypeSet of types
	 * 
	 * @param types
	 */
	public TypeSet(List<Enum<Types>> types) {
		this.types = (ArrayList<Enum<Types>>) types;
	}

	/**
	 * Adds a single type to the TypeSet
	 * 
	 * @param type
	 */
	public void addType(Enum<Types> type) {
		if (!typeInSet(type)) {
			this.types.add(type);
		}
	}

	/**
	 * Adds multiple types to the TypeSet
	 * 
	 * @param types2
	 * @return defunct
	 */
	public int addTypes(Types[] types2) {
		int added = 0;
		for (Types type : types2) {
			if (!typeInSet(type)) {
				addType(type);
				added++;
			}
		}

		return added;
	}

	public boolean typeInSet(Enum<Types> type) {
		if (this.types.size() == 0) {
			return false;
		}

		for (Enum<Types> x : this.types) {
			if (x == type) {
				return true;
			}
		}

		return false;
	}

	public ArrayList<Enum<Types>> getTypes() {
		ArrayList<Enum<Types>> gettypes = new ArrayList<Enum<Types>>();
		for (Enum<Types> x : this.types) {
			gettypes.add(x);
		}

		return gettypes;
	}

	public TypeSet getStrengths() {
		TypeSet strengths = new TypeSet();

		for(Enum<Types> element : types){
			Types[] singleEleStrs = this.getTypeFromElement(element).getStrengths();
			strengths.addTypes(singleEleStrs);
		}
		
		return strengths;
	}

	public Type getTypeFromElement(Enum<Types> element) {
		switch (element.toString()) {
		case "BUG":
			return new Bug();
		case "DARK":
			return new Dark();
		case "DRAGON":
			return new Dragon();
		case "ELECTRIC":
			return new Electric();
		case "FAIRY":
			return new Fairy();
		case "FIGHTING":
			return new Fighting();
		case "FIRE":
			return new Fire();
		case "FLYING":
			return new Flying();
		case "GHOST":
			return new Ghost();
		case "GRASS":
			return new Grass();
		case "GROUND":
			return new Ground();
		case "ICE":
			return new Ice();
		case "NORMAL":
			return new Normal();
		case "POISON":
			return new Poison();
		case "PSYCHIC":
			return new Psychic();
		case "ROCK":
			return new Rock();
		case "STEEL":
			return new Steel();
		case "WATER":
			return new Water();
		default:
			return null;
		}
	}

}
