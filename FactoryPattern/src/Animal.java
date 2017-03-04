public abstract class Animal {

	public enum Species {

		HEDGEHOG, MOUSE, BEAR, WOLF;

	}

	private String name;

	public static final Animal newAnimal(Species spc, String name) throws IllegalArgumentException {

		if (name == null || name.isEmpty())
			throw new IllegalArgumentException("Illegal name: name must have a value!: " + name);

		Animal anm;

		switch (spc) {
			case BEAR:
				anm = new Bear();
				break;
	
			case HEDGEHOG:
				anm = new Hedgehog();
				break;
	
			case MOUSE:
				anm = new Mouse();
				break;
	
			case WOLF:
				anm = new Wolf();
				break;
	
			default:
				anm = null;
		}

		anm.setName(name);

		return anm;

	}

	public abstract String makeNoise();

	public String getName() {
		return this.name;
	}

	private void setName(String name) {
		if (name == null || name.isEmpty())
			throw new IllegalArgumentException("Illegal name: name must have a value!: " + name);
		this.name = name;
	}

}
