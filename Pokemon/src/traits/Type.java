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

	public void setUnaffected(Types[] unaffected) {
		this.unaffected = unaffected;
	}

	public void setCantAffect(Types[] cantaffect) {
		this.cantaffect = cantaffect;
	}

	public boolean weakAgainst(Types type) {
		for (Types i : this.weaknesses)
			if (type.equals(i))
				return true;
		return false;
	}

	public boolean strongAgainst(Types type) {
		for (Types i : this.strengths)
			if (type.equals(i))
				return true;
		return false;
	}

	public boolean unaffectedBy(Types type) {
		for (Types i : this.unaffected)
			if (type.equals(i))
				return true;
		return false;
	}

	public boolean cantAffect(Types type) {
		for (Types i : this.cantaffect)
			if (type.equals(i))
				return true;
		return false;
	}

	public abstract Enum<Types> getElement();
}
