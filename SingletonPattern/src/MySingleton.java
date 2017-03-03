
public class MySingleton {

	private static MySingleton instance;

	private int size;
	private String name;
	private Object obj;

	private MySingleton(String name) {
		if (name == null || name.isEmpty())
			this.name = "N/A";
		else
			this.name = name;
	}

	public static MySingleton getInstance(String name) {
		if (instance == null)
			instance = new MySingleton(name);
		
		return instance;

	}

	public String getName() {
		return this.name;
	}

}
