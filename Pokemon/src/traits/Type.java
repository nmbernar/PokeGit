package traits;

public abstract class Type {
	private Element[] weaknesses = null;
	private Element[] strengths = null;
	private Element[] unaffected = null;
	private Element[] cantaffect = null;

	public Element[] getWeaknesses() {
		return weaknesses;
	}

	public Element[] getStrengths() {
		return strengths;
	}

	public Element[] getUnaffected() {
		return unaffected;
	}

	public Element[] getCantaffect() {
		return cantaffect;
	}

	public void setWeaknesses(Element[] weaknesses) {
		this.weaknesses = weaknesses;
	}

	public void setStrengths(Element[] strengths) {
		this.strengths = strengths;
	}

	public void setUnaffected(Element[] types) {
		this.unaffected = types;
	}

	public void setCantAffect(Element[] cantaffect) {
		this.cantaffect = cantaffect;
	}

	public boolean weakAgainst(Element enum1) {
		for (Element i : this.weaknesses)
			if (enum1.equals(i))
				return true;
		return false;
	}

	public boolean strongAgainst(Element enum1) {
		for (Element i : this.strengths)
			if (enum1.equals(i))
				return true;
		return false;
	}

	public boolean unaffectedBy(Enum<Element> enum1) {
		for (Element i : this.unaffected)
			if (enum1.equals(i))
				return true;
		return false;
	}

	public boolean cantAffect(Enum<Element> enum1) {
		for (Element i : this.cantaffect)
			if (enum1.equals(i))
				return true;
		return false;
	}

	public abstract Enum<Element> getElement();
}
