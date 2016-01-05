package objects;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a grouping of Types.<br>
 * This grouping considers the order of Types to be irrelevant to the uniqueness
 * of the grouping.
 * 
 * @author Nicholli
 *
 */
public class TypeSet {

	private ArrayList<Type> types = new ArrayList<Type>();

	/**
	 * Initializes set with zero types
	 */
	public TypeSet() {

	}

	/**
	 * Initializes set with one type
	 * 
	 * @param type
	 *            Type to be added along with the initialization of the TypeSet
	 */
	public TypeSet(Type type) {
		types.add(type);
	}

	/**
	 * Initializes set with a TypeSet of types
	 * 
	 * @param types
	 *            Types to be added along with the initialization of the TypeSet
	 */
	public TypeSet(List<Type> types) {
		this.types = (ArrayList<Type>) types;
	}

	/**
	 * Adds a single type to the TypeSet
	 * 
	 * @param type
	 *            Type to be added to the TypeSet
	 */
	public void addType(Type type) {
		if (!contains(type)) {
			this.types.add(type);
		}
	}

	/**
	 * Adds multiple types to the TypeSet
	 * @param addedTypes Types to be added
	 * @return number of types added
	 */
	public int addTypes(List<Type> addedTypes) {
		int added = 0;
		for (Type type : addedTypes) {
			if (!contains(type)) {
				addType(type);
				added++;
			}
		}

		return added;
	}

	/**
	 * Determines whether or not the provided Type is already in the TypeSet
	 * @param type Type to check against the TypeSet
	 * @return true if it is in the TypeSet, false otherwise
	 */
	public boolean contains(Type type) {
		if (this.types.size() == 0) {
			return false;
		}

		for (Type x : this.types) {
			if (x == type) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Gets the Types in an ArrayList
	 * @return An ArrayList of the Types in TypeSet
	 */
	public ArrayList<Type> getTypes() {
		return this.types;
	}

	/**
	 * Gets all of the Types the particular TypeSet is strong against
	 * @return TypeSet of Types that are weak against the original TypeSet
	 */
	public TypeSet getStrengths() {
		TypeSet strengths = new TypeSet();

		for (Type element : types) {
			strengths.addTypes(element.getStrengths().getTypes());
		}

		return strengths;
	}

	/**
	 * Compares the contents of two TypeSets
	 * 
	 * @param set
	 *            being compared to
	 * @return true if the two TypeSets contain the same elements, ignoring
	 *         order
	 */
	public boolean equals(TypeSet set) {
		ArrayList<Type> setTypes = set.getTypes();
		if (this.types.size() != setTypes.size()) {
			return false;
		}

		for (Type type : setTypes) {
			if (!this.contains(type)) {
				return false;
			}
		}

		return true;
	}
}
