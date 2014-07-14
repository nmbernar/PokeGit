package elements;
import traits.Type;
import traits.Types;

public class Steel extends Type{
	public Steel(){
		this.setStrengths(new Types[]{Types.ICE, 
				Types.ROCK, Types.FAIRY
		});
		this.setWeaknesses(new Types[]{Types.FIGHTING, 
				Types.FIRE, Types.GROUND});
		this.setUnaffected(new Types[]{Types.POISON});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.STEEL;
	}
}