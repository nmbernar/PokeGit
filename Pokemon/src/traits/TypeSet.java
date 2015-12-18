package traits;

import java.util.ArrayList;
import java.util.List;
import elements.*;

public class TypeSet {

	private ArrayList<Element> types = new ArrayList<Element>();

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
	public TypeSet(Element type) {
		types.add(type);
	}

	/**
	 * Initializes set with a TypeSet of types
	 * 
	 * @param types
	 */
	public TypeSet(List<Element> types) {
		this.types = (ArrayList<Element>) types;
	}

	/**
	 * Adds a single type to the TypeSet
	 * 
	 * @param type
	 */
	public void addType(Element type) {
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
	public int addTypes(Element[] types2) {
		int added = 0;
		for (Element type : types2) {
			if (!typeInSet(type)) {
				addType(type);
				added++;
			}
		}

		return added;
	}

	public boolean typeInSet(Element type) {
		if (this.types.size() == 0) {
			return false;
		}

		for (Element x : this.types) {
			if (x == type) {
				return true;
			}
		}

		return false;
	}

	public ArrayList<Element> getTypes() {
		ArrayList<Element> gettypes = new ArrayList<Element>();
		for (Element x : this.types) {
			gettypes.add(x);
		}

		return gettypes;
	}

	public TypeSet getStrengths() {
		TypeSet strengths = new TypeSet();

		for(Element element : types){
			Element[] singleEleStrs = this.getTypeFromElement(element).getStrengths();
			strengths.addTypes(singleEleStrs);
		}
		
		return strengths;
	}

	public Type getTypeFromElement(Element element) {
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
