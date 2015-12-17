package elements;
import traits.Type;
import traits.Element;

public class Grass extends Type{
	public Grass(){
		this.setStrengths(new Element[]{Element.ROCK, 
				Element.GROUND, Element.WATER});
		this.setWeaknesses(new Element[]{Element.BUG, 
				Element.FIRE, Element.POISON, Element.FLYING, 
				Element.ICE});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.GRASS;
	}
}