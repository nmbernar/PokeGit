package elements;
import traits.Type;
import traits.Types;

public class Poison extends Type{
	public Poison(){
		this.setStrengths(new Types[]{Types.GRASS, 
				Types.FAIRY});
		this.setWeaknesses(new Types[]{Types.GROUND, 
				Types.PSYCHIC});
		this.setCantAffect(new Types[]{Types.STEEL});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.POISON;
	}
}
