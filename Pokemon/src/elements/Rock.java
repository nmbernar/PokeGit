package elements;
import traits.Type;
import traits.Types;

public class Rock extends Type{
	public Rock(){
		this.setStrengths(new Types[]{Types.FIRE, 
				Types.ICE, Types.FLYING, Types.BUG});
		this.setWeaknesses(new Types[]{Types.WATER, 
				Types.GRASS, Types.FIGHTING, Types.STEEL, 
				Types.GROUND});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.ROCK;
	}
}
