package elements;
import traits.Type;
import traits.Types;

public class Dragon extends Type{
	public Dragon(){
		this.setStrengths(new Types[]{Types.DRAGON});
		this.setWeaknesses(new Types[]{Types.ICE, 
				Types.DRAGON, Types.FAIRY});
		this.setCantAffect(new Types[]{Types.DRAGON});
	}

	@Override
	public Enum<Types> getElement() {
		return Types.DRAGON;
	}
}
