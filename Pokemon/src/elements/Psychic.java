package elements;
import traits.Type;
import traits.Types;

public class Psychic extends Type{
	public Psychic(){
		this.setStrengths(new Types[]{Types.FIGHTING, 
				Types.POISON});
		this.setWeaknesses(new Types[]{Types.BUG, 
				Types.GHOST, Types.DARK});
		this.setCantAffect(new Types[]{Types.DARK});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.PSYCHIC;
	}
	
}
