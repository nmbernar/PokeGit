package elements;
import traits.Type;
import traits.Types;

public class Fire extends Type{
	public Fire(){
		this.setStrengths(new Types[]{Types.BUG, 
				Types.GRASS, Types.STEEL, Types.ICE});
		this.setWeaknesses(new Types[]{Types.GROUND, 
				Types.ROCK, Types.WATER});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.FIRE;
	}
}
