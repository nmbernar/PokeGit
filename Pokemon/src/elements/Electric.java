package elements;
import traits.Type;
import traits.Element;

public class Electric extends Type{
	public Electric(){
		this.setStrengths(new Element[]{Element.WATER, 
				Element.FLYING});
		this.setWeaknesses(new Element[]{Element.GROUND});
		this.setCantAffect(new Element[]{Element.GROUND});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.ELECTRIC;
	}
}
