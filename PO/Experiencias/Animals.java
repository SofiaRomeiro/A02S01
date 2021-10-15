public interface FarmUsecases {
	public int countAnimals();
	public void addAnimal(Animal animal);

}


public class Farm implements FarmUsecases {

	private List<Animal> animals = new ArrayList<Animal>();

	public int countAnimals() {
		return animals.length;
	}
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}



}

public abstract class Animal {
	
	private int _age;
	private String _name;

	public Animal(int a, String n) {
		_age = a;
		_name = n;
	}

	public abstract void eat() {
		System.out.println("To implement...");
	}

}

-----------------------------------------

public class Dog extends Animal {
	
	private boolean _hasTail;

	public Dog(int a, String n, boolean ht) {
		super(a, n);
		_hasTail = ht;
	}

	@Override
	public void eat() {
		System.out.println("Dog eating...");
	}

	@Override
	public void toString() {
		System.out.println("Im a dog...");
	}

}

--------------------------------------------

public class MiauMiau extends Animal {
	
	private boolean _isFluffy;

	public MiauMiau(int a, String n, bollean ifl) {
		super(a, n);
		_isFluffy = ifl;
	}

	@Override
	public void eat() {
		System.out.println("Cat eating...");
	}

	@Override
	public void toString() {
		System.out.println("Im a cat...");
	}

}


---------------------------------------------

Animal a = (Animal) new Dog(a, n, t);
Animal a = new Dog(a, n, t);
a._hasTail x

Dog d = new Animal(a, n); x

Dog d = new Dog(a, n, t);

Animal a = new Animal(a, n); // impossible with abstract

---------------------------------------------


List<Animal> animals = new List<Animal>();
animals.add(new Dog(a, n, t));
animals.add(new MiauMiau(a, n, t));

for (Animal a : animals)
	a.eat();


