package elements;
import traits.Type;
import traits.Types;

public class Electric extends Type{
	public Electric(){
		this.setStrengths(new Types[]{Types.WATER, 
				Types.FLYING});
		this.setWeaknesses(new Types[]{Types.GROUND});
		this.setCantAffect(new Types[]{Types.GROUND});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.ELECTRIC;
	}
}
