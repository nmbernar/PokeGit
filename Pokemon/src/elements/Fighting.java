package elements;
import traits.Type;
import traits.Types;

public class Fighting extends Type{
	public Fighting(){
		this.setStrengths(new Types[]{Types.NORMAL,
				Types.ICE, Types.ROCK, Types.DARK,
				Types.STEEL});
		this.setWeaknesses(new Types[]{Types.FLYING,
				Types.PSYCHIC, Types.FAIRY});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.FIGHTING;
	}
}
