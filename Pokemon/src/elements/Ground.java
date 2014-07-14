package elements;
import traits.Type;
import traits.Types;

public class Ground extends Type{
	public Ground(){
		this.setStrengths(new Types[]{Types.FIRE,
				Types.ELECTRIC, Types.POISON, 
				Types.ROCK, Types.STEEL});
		this.setWeaknesses(new Types[]{Types.WATER,
				Types.GRASS, Types.ICE});
		this.setUnaffected(new Types[]{Types.ELECTRIC});
		this.setCantAffect(new Types[]{Types.FLYING});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.GROUND;
	}
}
