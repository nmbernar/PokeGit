package elements;
import traits.Type;
import traits.Types;

public class Dark extends Type{
	public Dark(){
		this.setStrengths(new Types[]{Types.PSYCHIC, 
				Types.GHOST});
		this.setWeaknesses(new Types[]{Types.FIGHTING, 
				Types.BUG, Types.FAIRY});
		this.setUnaffected(new Types[]{Types.PSYCHIC});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.DARK;
	}
}
