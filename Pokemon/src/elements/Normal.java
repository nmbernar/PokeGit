package elements;
import traits.Type;
import traits.Element;

public class Normal extends Type{
	public Normal(){
		this.setStrengths(null);
		this.setWeaknesses(new Element[]{Element.FIGHTING});
		this.setCantAffect(new Element[]{Element.GHOST});
	}

	@Override
	public Enum<Element> getElement() {
		return Element.NORMAL;
	}
}