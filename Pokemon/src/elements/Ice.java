package elements;
import traits.Type;
import traits.Types;

public class Ice extends Type{
	public Ice(){
		this.setStrengths(new Types[]{Types.GRASS, 
				Types.GROUND, Types.FLYING, Types.DRAGON});
		this.setWeaknesses(new Types[]{Types.FIRE, 
				Types.FIGHTING, Types.ROCK, Types.STEEL});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.ICE;
	}
}