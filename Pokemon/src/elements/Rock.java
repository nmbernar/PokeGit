package elements;
import traits.Type;
import traits.Element;

public class Rock extends Type{
	public Rock(){
		this.setStrengths(new Element[]{Element.FIRE, 
				Element.ICE, Element.FLYING, Element.BUG});
		this.setWeaknesses(new Element[]{Element.WATER, 
				Element.GRASS, Element.FIGHTING, Element.STEEL, 
				Element.GROUND});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.ROCK;
	}
}
