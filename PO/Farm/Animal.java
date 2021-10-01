public class Animal {

	private String _name;
	private int _age;
	private int _numberOfFeet;
	private String _sound;
	private boolean _isSelvage;

	public Animal(String n, int a, int f, String s, boolean se) {
		_name= n;
		_age = a;
		_numberOfFeet = f;
		_sound = s;
		_isSelvage = se;
	} 

	public Animal(String n, int a, int f, String s) {
		this(n, a, f, s, false);
	}

	public String makeSound() {
		return _sound;
	}

	public void addAge(Animal a) {
		a._age++;
	}

	public String showName(Animal a) {
		return a._name;
	}

	public static void main(String[] args) {
		Animal a1 = new Animal("Whiskas", 5, 4, "bark");
		

		System.out.println(a1._name);


	}

}

