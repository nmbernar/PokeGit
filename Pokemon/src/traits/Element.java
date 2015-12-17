package traits;

import java.util.ArrayList;
import java.util.Arrays;

public enum Element {
	FIRE {
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.GRASS, Element.BUG, Element.STEEL, Element.ICE)));
		}

		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.GROUND, Element.ROCK, Element.WATER)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet();
		}
	},
	WATER {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.ROCK, Element.GROUND, Element.FIRE)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.ELECTRIC, 
					Element.GRASS)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	GRASS {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.ROCK, 
					Element.GROUND, Element.WATER)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.BUG, 
					Element.FIRE, Element.POISON, Element.FLYING, 
					Element.ICE)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet();
		}

	},
	ELECTRIC {

		@Override
		public TypeSet getStrengths() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getWeaknesses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getUnaffected() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getCantAffect() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	FLYING {

		@Override
		public TypeSet getStrengths() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getWeaknesses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getUnaffected() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getCantAffect() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	ROCK {

		@Override
		public TypeSet getStrengths() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getWeaknesses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getUnaffected() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getCantAffect() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	GHOST {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.PSYCHIC, 
					Element.GHOST)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.GHOST, 
					Element.DARK)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.NORMAL, 
				Element.FIGHTING)));
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet();
		}

	},
	BUG {

		@Override
		public TypeSet getStrengths() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getWeaknesses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getUnaffected() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getCantAffect() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	NORMAL {

		@Override
		public TypeSet getStrengths() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getWeaknesses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getUnaffected() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getCantAffect() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	STEEL {

		@Override
		public TypeSet getStrengths() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getWeaknesses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getUnaffected() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getCantAffect() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	FIGHTING {

		@Override
		public TypeSet getStrengths() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getWeaknesses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getUnaffected() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getCantAffect() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	DRAGON {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(Element.DRAGON);
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(Arrays.asList(Element.ICE, 
					Element.DRAGON, Element.FAIRY));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet(Element.FAIRY);
		}

	},
	FAIRY {

		@Override
		public TypeSet getStrengths() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getWeaknesses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getUnaffected() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getCantAffect() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	DARK {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.PSYCHIC, 
					Element.GHOST)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.FIGHTING, 
					Element.BUG, Element.FAIRY)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet(Element.PSYCHIC);
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet();
		}

	},
	ICE {

		@Override
		public TypeSet getStrengths() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getWeaknesses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getUnaffected() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getCantAffect() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	GROUND {

		@Override
		public TypeSet getStrengths() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getWeaknesses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getUnaffected() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getCantAffect() {
			// TODO Auto-generated method stub
			return null;
		}

	},
	PSYCHIC {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.FIGHTING, 
					Element.POISON)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.BUG, 
					Element.GHOST, Element.DARK)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet(Element.DARK);
		}

	},
	POISON {

		@Override
		public TypeSet getStrengths() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getWeaknesses() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getUnaffected() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TypeSet getCantAffect() {
			// TODO Auto-generated method stub
			return null;
		}

	};

	/**
	 * Gets the elements that this element is super-effective against
	 * @return TypeSet set of types
	 */
	public abstract TypeSet getStrengths();

	/**
	 * Gets the elements that are super-effective against this element
	 * @return TypeSet set of types
	 * @return
	 */
	public abstract TypeSet getWeaknesses();

	/**
	 * Gets the elements that are unaffected by this element
	 * @return TypeSet set of types
	 */
	public abstract TypeSet getUnaffected();

	/**
	 * Gets the elements that this element can't affect
	 * @return TypeSet set of types
	 */
	public abstract TypeSet getCantAffect();
}
