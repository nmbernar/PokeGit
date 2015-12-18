package elements;
import traits.Type;
import traits.Element;

public class Ghost extends Type{
	public Ghost(){
		this.setStrengths(new Element[]{Element.PSYCHIC, 
				Element.GHOST});
		this.setWeaknesses(new Element[]{Element.GHOST, 
				Element.DARK});
		this.setUnaffected(new Element[]{Element.NORMAL, 
				Element.FIGHTING});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.GHOST;
	}
}