package elements;
import traits.Type;
import traits.Element;

public class Fighting extends Type{
	public Fighting(){
		this.setStrengths(new Element[]{Element.NORMAL,
				Element.ICE, Element.ROCK, Element.DARK,
				Element.STEEL});
		this.setWeaknesses(new Element[]{Element.FLYING,
				Element.PSYCHIC, Element.FAIRY});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.FIGHTING;
	}
}
