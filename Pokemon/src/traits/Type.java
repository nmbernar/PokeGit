package traits;

public abstract class Type {
	private Types[] weaknesses = null;
	private Types[] strengths = null;
	private Types[] unaffected = null;
	private Types[] cantaffect = null;

	public Types[] getWeaknesses() {
		return weaknesses;
	}

	public Types[] getStrengths() {
		return strengths;
	}

	public Types[] getUnaffected() {
		return unaffected;
	}

	public Types[] getCantaffect() {
		return cantaffect;
	}

	public void setWeaknesses(Types[] weaknesses) {
		this.weaknesses = weaknesses;
	}

	public void setStrengths(Types[] strengths) {
		this.strengths = strengths;
	}

	public void setUnaffected(Types[] types) {
		this.unaffected = types;
	}

	public void setCantAffect(Types[] cantaffect) {
		this.cantaffect = cantaffect;
	}

	public boolean weakAgainst(Enum<Types> enum1) {
		for (Types i : this.weaknesses)
			if (enum1.equals(i))
				return true;
		return false;
	}

	public boolean strongAgainst(Enum<Types> enum1) {
		for (Types i : this.strengths)
			if (enum1.equals(i))
				return true;
		return false;
	}

	public boolean unaffectedBy(Enum<Types> enum1) {
		for (Types i : this.unaffected)
			if (enum1.equals(i))
				return true;
		return false;
	}

	public boolean cantAffect(Enum<Types> enum1) {
		for (Types i : this.cantaffect)
			if (enum1.equals(i))
				return true;
		return false;
	}

	public abstract Enum<Types> getElement();
}
