package elements;
import traits.Type;
import traits.Element;

public class Dragon extends Type{
	public Dragon(){
		this.setStrengths(new Element[]{Element.DRAGON});
		this.setWeaknesses(new Element[]{Element.ICE, 
				Element.DRAGON, Element.FAIRY});
		this.setCantAffect(new Element[]{Element.FAIRY});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.DRAGON;
	}
}
