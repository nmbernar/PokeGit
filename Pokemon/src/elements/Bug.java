package elements;
import traits.Type;
import traits.Element;

public class Bug extends Type{
	public Bug(){
		this.setStrengths(new Element[]{Element.GRASS, 
				Element.PSYCHIC, Element.DARK});
		this.setWeaknesses(new Element[]{Element.FIRE, 
				Element.FLYING, Element.ROCK});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.BUG;
	}
}