package elements;
import traits.Type;
import traits.Types;

public class Normal extends Type{
	public Normal(){
		this.setStrengths(null);
		this.setWeaknesses(new Types[]{Types.FIGHTING});
		this.setCantAffect(new Types[]{Types.GHOST});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.NORMAL;
	}
}