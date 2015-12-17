package elements;
import traits.Type;
import traits.Element;

public class Flying extends Type{
	public Flying(){
		this.setStrengths(new Element[]{Element.GRASS, 
				Element.FIGHTING, Element.BUG});
		this.setWeaknesses(new Element[]{Element.ELECTRIC, 
				Element.ICE, Element.ROCK});
		this.setUnaffected(new Element[]{Element.GROUND});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.FLYING;
	}
}
