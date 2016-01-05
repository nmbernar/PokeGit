package objects;

import java.util.ArrayList;
import java.util.Arrays;

public enum Type {
	FIRE {
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.GRASS, Type.BUG, Type.STEEL, Type.ICE)));
		}

		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.GROUND, Type.ROCK, Type.WATER)));
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
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.ROCK, Type.GROUND, Type.FIRE)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.ELECTRIC, Type.GRASS)));
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
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.ROCK, Type.GROUND, Type.WATER)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(
					Arrays.asList(Type.BUG, Type.FIRE, Type.POISON, Type.FLYING, Type.ICE)));
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
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.WATER, Type.FLYING)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(Type.GROUND);
		}

		@Override
		public TypeSet getUnaffected() {

			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet(Type.GROUND);
		}

	},
	FLYING {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.GRASS, Type.FIGHTING, Type.BUG)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.ELECTRIC, Type.ICE, Type.ROCK)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet(Type.GROUND);
		}

		@Override
		public TypeSet getCantAffect() {

			return new TypeSet();
		}

	},
	ROCK {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.FIRE, Type.ICE, Type.FLYING, Type.BUG)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(
					Arrays.asList(Type.WATER, Type.GRASS, Type.FIGHTING, Type.STEEL, Type.GROUND)));
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
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.PSYCHIC, Type.GHOST)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.GHOST, Type.DARK)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.NORMAL, Type.FIGHTING)));
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet();
		}

	},
	BUG {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.GRASS, Type.PSYCHIC, Type.DARK)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.FIRE, Type.FLYING, Type.ROCK)));
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
			return new TypeSet(Type.FIGHTING);
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
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.ICE, Type.ROCK, Type.FAIRY)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.FIGHTING, Type.FIRE, Type.GROUND)));
		}

		@Override
		public TypeSet getUnaffected() {

			return new TypeSet(Type.POISON);
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
					Arrays.asList(Type.NORMAL, Type.ICE, Type.ROCK, Type.DARK, Type.STEEL)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.FLYING, Type.PSYCHIC, Type.FAIRY)));
		}

		@Override
		public TypeSet getUnaffected() {

			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet(Type.GHOST);
		}

	},
	DRAGON {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(Type.DRAGON);
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(Arrays.asList(Type.ICE, Type.DRAGON, Type.FAIRY));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet(Type.FAIRY);
		}

	},
	FAIRY {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.FIGHTING, Type.DRAGON, Type.DARK)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.POISON, Type.STEEL)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet(Type.DRAGON);
		}

		@Override
		public TypeSet getCantAffect() {

			return new TypeSet();
		}

	},
	DARK {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.PSYCHIC, Type.GHOST)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.FIGHTING, Type.BUG, Type.FAIRY)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet(Type.PSYCHIC);
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
					new ArrayList<>(Arrays.asList(Type.GRASS, Type.GROUND, Type.FLYING, Type.DRAGON)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(
					new ArrayList<>(Arrays.asList(Type.FIRE, Type.FIGHTING, Type.ROCK, Type.STEEL)));
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
					Arrays.asList(Type.FIRE, Type.ELECTRIC, Type.POISON, Type.ROCK, Type.STEEL)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.WATER, Type.GRASS, Type.ICE)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet(Type.ELECTRIC);
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet(Type.FLYING);
		}

	},
	PSYCHIC {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.FIGHTING, Type.POISON)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.BUG, Type.GHOST, Type.DARK)));
		}

		@Override
		public TypeSet getUnaffected() {
			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet(Type.DARK);
		}

	},
	POISON {

		@Override
		public TypeSet getStrengths() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.GRASS, Type.FAIRY)));
		}

		@Override
		public TypeSet getWeaknesses() {
			return new TypeSet(new ArrayList<>(Arrays.asList(Type.GROUND, Type.PSYCHIC)));
		}

		@Override
		public TypeSet getUnaffected() {

			return new TypeSet();
		}

		@Override
		public TypeSet getCantAffect() {
			return new TypeSet(Type.STEEL);
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

	public Type getElementFromString(String ele) {
		ele = ele.toUpperCase();
		switch (ele) {
		case "BUG":
			return Type.BUG;
		case "DARK":
			return Type.DARK;
		case "DRAGON":
			return Type.DRAGON;
		case "ELECTRIC":
			return Type.ELECTRIC;
		case "FAIRY":
			return Type.FAIRY;
		case "FIGHTING":
			return Type.FIGHTING;
		case "FIRE":
			return Type.FIRE;
		case "FLYING":
			return Type.FLYING;
		case "GHOST":
			return Type.GHOST;
		case "GRASS":
			return Type.GRASS;
		case "GROUND":
			return Type.GROUND;
		case "ICE":
			return Type.ICE;
		case "NORMAL":
			return Type.NORMAL;
		case "POISON":
			return Type.POISON;
		case "PSYCHIC":
			return Type.PSYCHIC;
		case "ROCK":
			return Type.ROCK;
		case "STEEL":
			return Type.STEEL;
		case "WATER":
			return Type.WATER;
		default:
			return null;
		}
	}
}
