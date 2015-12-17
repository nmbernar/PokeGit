package elements;
import traits.Type;
import traits.Element;

public class Dark extends Type{
	public Dark(){
		this.setStrengths(new Element[]{Element.PSYCHIC, 
				Element.GHOST});
		this.setWeaknesses(new Element[]{Element.FIGHTING, 
				Element.BUG, Element.FAIRY});
		this.setUnaffected(new Element[]{Element.PSYCHIC});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.DARK;
	}
}
