package elements;
import traits.Type;
import traits.Types;

public class Grass extends Type{
	public Grass(){
		this.setStrengths(new Types[]{Types.ROCK, 
				Types.GROUND, Types.WATER});
		this.setWeaknesses(new Types[]{Types.BUG, 
				Types.FIRE, Types.POISON, Types.FLYING, 
				Types.ICE});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.GRASS;
	}
}