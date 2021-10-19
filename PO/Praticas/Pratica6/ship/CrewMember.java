package ship;

public class CrewMember {

	private int _id;
	private String _name;
	private int _birthYear;
	private double _salary;

	public CrewMember(int id, String name, int birthYear, double salary) {
		_id = id;
		_name = name;
		_birthYear = birthYear;
		_salary = salary;
	}

	public double getSalary() {
		return _salary;
	}

	public int getBirthYear() {
		return _birthYear;
	}

	public int getId() {
		return _id;
	}

	public String toString() {
		return String.format("%d, %s, %d, %.2f", _id, _name, _birthYear, _salary);
	}




}