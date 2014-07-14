package elements;
import traits.Type;
import traits.Types;

public class Bug extends Type{
	public Bug(){
		this.setStrengths(new Types[]{Types.GRASS, 
				Types.PSYCHIC, Types.DARK});
		this.setWeaknesses(new Types[]{Types.FIRE, 
				Types.FLYING, Types.ROCK});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.BUG;
	}
}