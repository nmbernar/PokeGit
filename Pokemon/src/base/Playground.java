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
		PokeAppController app = new PokeAppController();
		
		Pokemon s = db.getPokemonFromName("Umbreon");
		Pokemon t = db.getPokemonFromName("Emboar");
		Pokemon u = db.getPokemonFromName("Lapras");
		Pokemon x = db.getPokemonFromName("Charizard");
		Pokemon y = db.getPokemonFromName("Pikachu");
		Pokemon z = db.getPokemonFromName("Lugia");
		
		ArrayList<Pokemon> alpha = new ArrayList<Pokemon>();
		
		alpha.add(s);
		alpha.add(t);
		alpha.add(u);
		alpha.add(x);
		alpha.add(y);
		alpha.add(z);
		
		TypeSet beta = app.getStrengthsFromPokeTypes(alpha);
		
		for(Element d : beta.getTypes())
			System.out.println(d);
	}

}
