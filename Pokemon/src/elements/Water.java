package elements;
import traits.Type;
import traits.Types;

public class Water extends Type{
	public Water(){
		this.setStrengths(new Types[]{Types.ROCK, 
				Types.GROUND, Types.FIRE});
		this.setWeaknesses(new Types[]{Types.ELECTRIC, 
				Types.GRASS});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.WATER;
	}
}
