package elements;
import traits.Type;
import traits.Element;

public class Steel extends Type{
	public Steel(){
		this.setStrengths(new Element[]{Element.ICE, 
				Element.ROCK, Element.FAIRY
		});
		this.setWeaknesses(new Element[]{Element.FIGHTING, 
				Element.FIRE, Element.GROUND});
		this.setUnaffected(new Element[]{Element.POISON});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.STEEL;
	}
}