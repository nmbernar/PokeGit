package elements;
import traits.Type;
import traits.Element;

public class Psychic extends Type{
	public Psychic(){
		this.setStrengths(new Element[]{Element.FIGHTING, 
				Element.POISON});
		this.setWeaknesses(new Element[]{Element.BUG, 
				Element.GHOST, Element.DARK});
		this.setCantAffect(new Element[]{Element.DARK});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.PSYCHIC;
	}
	
}
