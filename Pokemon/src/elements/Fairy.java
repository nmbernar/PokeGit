package elements;
import traits.Type;
import traits.Types;

public class Fairy extends Type{
	public Fairy(){
		this.setStrengths(new Types[]{Types.FIGHTING, 
				Types.DRAGON, Types.DARK});
		this.setWeaknesses(new Types[]{Types.POISON, 
				Types.STEEL});
		this.setUnaffected(new Types[]{Types.DRAGON});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.FAIRY;
	}
}
