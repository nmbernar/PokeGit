package base;

import java.util.ArrayList;

import traits.Pokemon;
import traits.Type;
import traits.TypeSet;
import traits.Element;

public class SetTest {

	public static void main(String[] args) {
		PokeDBController db = new PokeDBController();
		
		Pokemon x = db.getPokemonFromName("Charizard");
		Pokemon y = db.getPokemonFromName("Pikachu");
		Pokemon z = db.getPokemonFromName("Lugia");
		
		ArrayList<Pokemon> alpha = new ArrayList<Pokemon>();
		
		alpha.add(x);
		alpha.add(y);
		alpha.add(z);
		
		TypeSet beta = db.getStrengthsFromPokeTypes(alpha);
		
		for(Enum<Element> d : beta.getTypes())
			System.out.println(d);
	}

}
