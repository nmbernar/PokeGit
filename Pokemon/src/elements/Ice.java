package elements;
import traits.Type;
import traits.Element;

public class Ice extends Type{
	public Ice(){
		this.setStrengths(new Element[]{Element.GRASS, 
				Element.GROUND, Element.FLYING, Element.DRAGON});
		this.setWeaknesses(new Element[]{Element.FIRE, 
				Element.FIGHTING, Element.ROCK, Element.STEEL});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.ICE;
	}
}