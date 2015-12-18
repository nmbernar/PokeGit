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
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.ELECTRIC, Element.GRASS)));
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
	GRASS {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.ROCK, Element.GROUND, Element.WATER)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(
					Arrays.asList(Element.BUG, Element.FIRE, Element.POISON, Element.FLYING, Element.ICE)));
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
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.WATER, Element.FLYING)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(Element.GROUND);
		}

		@Override
		public TypeSet getUnaffected() {

			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet(Element.GROUND);
		}

	},
	FLYING {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.GRASS, Element.FIGHTING, Element.BUG)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.ELECTRIC, Element.ICE, Element.ROCK)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet(Element.GROUND);
		}

		@Override
		public TypeSet getCantAffect() {

			return new TypeSet();
		}

	},
	ROCK {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.FIRE, Element.ICE, Element.FLYING, Element.BUG)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(
					Arrays.asList(Element.WATER, Element.GRASS, Element.FIGHTING, Element.STEEL, Element.GROUND)));
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
	GHOST {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.PSYCHIC, Element.GHOST)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.GHOST, Element.DARK)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.NORMAL, Element.FIGHTING)));
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet();
		}

	},
	BUG {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.GRASS, Element.PSYCHIC, Element.DARK)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.FIRE, Element.FLYING, Element.ROCK)));
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
	NORMAL {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet();
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(Element.FIGHTING);
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
	STEEL {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.ICE, Element.ROCK, Element.FAIRY)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.FIGHTING, Element.FIRE, Element.GROUND)));
		}

		@Override
		public TypeSet getUnaffected() {

			return new TypeSet(Element.POISON);
		}

		@Override
		public TypeSet getCantAffect() {

			return new TypeSet();
		}

	},
	FIGHTING {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(
					Arrays.asList(Element.NORMAL, Element.ICE, Element.ROCK, Element.DARK, Element.STEEL)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.FLYING, Element.PSYCHIC, Element.FAIRY)));
		}

		@Override
		public TypeSet getUnaffected() {

			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet(Element.GHOST);
		}

	},
	DRAGON {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(Element.DRAGON);
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(Arrays.asList(Element.ICE, Element.DRAGON, Element.FAIRY));
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
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.FIGHTING, Element.DRAGON, Element.DARK)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.POISON, Element.STEEL)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet(Element.DRAGON);
		}

		@Override
		public TypeSet getCantAffect() {

			return new TypeSet();
		}

	},
	DARK {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.PSYCHIC, Element.GHOST)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.FIGHTING, Element.BUG, Element.FAIRY)));
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
			return new TypeSet(
					new ArrayList<>(Arrays.asList(Element.GRASS, Element.GROUND, Element.FLYING, Element.DRAGON)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(
					new ArrayList<>(Arrays.asList(Element.FIRE, Element.FIGHTING, Element.ROCK, Element.STEEL)));
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
	GROUND {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(
					Arrays.asList(Element.FIRE, Element.ELECTRIC, Element.POISON, Element.ROCK, Element.STEEL)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.WATER, Element.GRASS, Element.ICE)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet(Element.ELECTRIC);
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet(Element.FLYING);
		}

	},
	PSYCHIC {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.FIGHTING, Element.POISON)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.BUG, Element.GHOST, Element.DARK)));
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
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.GRASS, Element.FAIRY)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Element.GROUND, Element.PSYCHIC)));
		}

		@Override
		public TypeSet getUnaffected() {

			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet(Element.STEEL);
		}

	};

	/**
	 * Gets the elements that this element is super-effective against
	 * 
	 * @return TypeSet set of types
	 */
	public abstract TypeSet getStrengths();

	/**
	 * Gets the elements that are super-effective against this element
	 * 
	 * @return TypeSet set of types
	 * @return
	 */
	public abstract TypeSet getWeaknesses();

	/**
	 * Gets the elements that are unaffected by this element
	 * 
	 * @return TypeSet set of types
	 */
	public abstract TypeSet getUnaffected();

	/**
	 * Gets the elements that this element can't affect
	 * 
	 * @return TypeSet set of types
	 */
	public abstract TypeSet getCantAffect();
}
