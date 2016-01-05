package base;

import java.util.ArrayList;

import objects.Pokemon;
import objects.TypeSet;

public class PokeAppController {

	public PokeAppController() {
		
	}
	
	public TypeSet getStrengthsFromPokeTypes(ArrayList<Pokemon> pokes) {
		TypeSet types = new TypeSet();

		for (Pokemon p : pokes) {
			types.addTypes(p.getPrimaryType().getStrengths().getTypes());
			if (p.getSecondaryType() != null)
				types.addTypes(p.getSecondaryType().getStrengths().getTypes());
		}

		return types;
	}
}
