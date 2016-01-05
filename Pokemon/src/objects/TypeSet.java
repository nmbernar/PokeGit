package objects;

import java.util.ArrayList;
import java.util.List;

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
	 * @param typeSet
	 * @return returns the number of types added to the TypeSet
	 */
	public int addTypes(TypeSet typeSet) {
		int added = 0;
		for (Element type : typeSet.getTypes()) {
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
		return this.types;
	}

	public TypeSet getStrengths() {
		TypeSet strengths = new TypeSet();

		for(Element element : types){
			strengths.addTypes(element.getStrengths());
		}
		
		return strengths;
	}

	/**
	 * Compares the contents of two TypeSets
	 * @param set being compared to
	 * @return true if the two TypeSets contain the same elements, ignoring order
	 */
	public boolean equals(TypeSet set){
		ArrayList<Element> setTypes = set.getTypes();
		if(this.types.size() != setTypes.size()){
			return false;
		}
		
		for(Element type : setTypes) {
			if(!this.typeInSet(type)){
				return false;
			}
		}
		
		return true;
	}
}
