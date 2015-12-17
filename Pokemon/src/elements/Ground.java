package elements;
import traits.Type;
import traits.Element;

public class Ground extends Type{
	public Ground(){
		this.setStrengths(new Element[]{Element.FIRE,
				Element.ELECTRIC, Element.POISON, 
				Element.ROCK, Element.STEEL});
		this.setWeaknesses(new Element[]{Element.WATER,
				Element.GRASS, Element.ICE});
		this.setUnaffected(new Element[]{Element.ELECTRIC});
		this.setCantAffect(new Element[]{Element.FLYING});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.GROUND;
	}
}
