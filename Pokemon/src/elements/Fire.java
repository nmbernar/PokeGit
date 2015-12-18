package elements;
import traits.Type;
import traits.Element;

public class Fire extends Type{
	public Fire(){
		this.setStrengths(new Element[]{Element.BUG, 
				Element.GRASS, Element.STEEL, Element.ICE});
		this.setWeaknesses(new Element[]{Element.GROUND, 
				Element.ROCK, Element.WATER});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.FIRE;
	}
}
