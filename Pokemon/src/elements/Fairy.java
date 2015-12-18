package elements;
import traits.Type;
import traits.Element;

public class Fairy extends Type{
	public Fairy(){
		this.setStrengths(new Element[]{Element.FIGHTING, 
				Element.DRAGON, Element.DARK});
		this.setWeaknesses(new Element[]{Element.POISON, 
				Element.STEEL});
		this.setUnaffected(new Element[]{Element.DRAGON});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.FAIRY;
	}
}
