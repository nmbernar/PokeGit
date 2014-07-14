package elements;
import traits.Type;
import traits.Types;

public class Ghost extends Type{
	public Ghost(){
		this.setStrengths(new Types[]{Types.PSYCHIC, 
				Types.GHOST});
		this.setWeaknesses(new Types[]{Types.GHOST, 
				Types.DARK});
		this.setUnaffected(new Types[]{Types.NORMAL, 
				Types.FIGHTING});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.GHOST;
	}
}