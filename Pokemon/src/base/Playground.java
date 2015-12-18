package base;

import java.util.ArrayList;

import objects.Element;
import objects.Pokemon;
import objects.TypeSet;

/**
 * Class made for me to mess around with, not really going to be in final product
 * @author Nicholli
 *
 */
public class Playground {

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
		
		for(Element d : beta.getTypes())
			System.out.println(d);
	}

}
