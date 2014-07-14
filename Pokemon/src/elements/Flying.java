package elements;
import traits.Type;
import traits.Types;

public class Flying extends Type{
	public Flying(){
		this.setStrengths(new Types[]{Types.GRASS, 
				Types.FIGHTING, Types.BUG});
		this.setWeaknesses(new Types[]{Types.ELECTRIC, 
				Types.ICE, Types.ROCK});
		this.setUnaffected(new Types[]{Types.GROUND});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.FLYING;
	}
}
