package elements;
import traits.Type;
import traits.Element;

public class Poison extends Type{
	public Poison(){
		this.setStrengths(new Element[]{Element.GRASS, 
				Element.FAIRY});
		this.setWeaknesses(new Element[]{Element.GROUND, 
				Element.PSYCHIC});
		this.setCantAffect(new Element[]{Element.STEEL});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.POISON;
	}
}
