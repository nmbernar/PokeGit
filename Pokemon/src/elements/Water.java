package elements;
import traits.Type;
import traits.Element;

public class Water extends Type{
	public Water(){
		this.setStrengths(new Element[]{Element.ROCK, 
				Element.GROUND, Element.FIRE});
		this.setWeaknesses(new Element[]{Element.ELECTRIC, 
				Element.GRASS});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.WATER;
	}
}
