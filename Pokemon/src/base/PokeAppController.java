package base;

import java.util.ArrayList;
import java.util.List;

import objects.Pokemon;
import objects.TypeSet;

/**
 * Class used to represent a controller used to interact with the application
 * @author Nicholli
 *
 */
public class PokeAppController {

	public PokeAppController() {
		
	}
	
	/**
	 * Given a List of Pokemon, this function returns a set of Types that the list of Pokemon is strong against
	 * @param pokes List of Pokemon to get their strengths from
	 * @return TypeSet of the Types the given Pokemon are strong against
	 */
	public TypeSet getStrengthsFromPokeTypes(List<Pokemon> pokes) {
		TypeSet types = new TypeSet();

		for (Pokemon p : pokes) {
			types.addTypes(p.getPrimaryType().getStrengths().getTypes());
			if (p.getSecondaryType() != null)
				types.addTypes(p.getSecondaryType().getStrengths().getTypes());
		}

		return types;
	}
}
