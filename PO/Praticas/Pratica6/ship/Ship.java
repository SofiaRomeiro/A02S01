package ship;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

import ship.CrewMember;

public class Ship {

	private List<CrewMember> _crew;
	private int counter = 0;

	public Ship() {
		_crew = new LinkedList<>();
	}

	// acesso rápido por identificador
	public CrewMember getCrewMember(int id) {

		for (CrewMember c : _crew) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}

	public void addCrewMember(String name, int birthYear, double salary) {
		_crew.add(new CrewMember(counter, name, birthYear, salary));
		counter += 1;
	}

	public void showCrewMembers() {

		System.out.println("On this ship:");
		for (CrewMember c : _crew) {
			System.out.println(c.toString());
		}
	}

	// pesquisar por valor
	public ArrayList<CrewMember> getUnderSalary(double salary) {

		ArrayList<CrewMember> under = new ArrayList<>();

		for (CrewMember c :_crew) {
			if (c.getSalary() < salary) {
				under.add(c);
			}
		}

		return under;
	}

	// remover 1 tripulante de cada vez
	public boolean removeCrewMember(int id) {

		for (CrewMember c : _crew) {

			if (c.getId() == id)
				return _crew.remove(c);
		}

		return false;
	}		

	// remover todos os tripulantes com um dado ano de nascimento
	public void removeAboveAge(int year) {

		Iterator<CrewMember> iter = _crew.iterator();

		while(iter.hasNext()) {
			CrewMember c = iter.next();
			if (c.getBirthYear() < year) {
				iter.remove();
			}
		}
	}

	public static void main(String[] args) {

		Ship ship = new Ship();
		ship.addCrewMember("Rui", 2002, 805.83);
		ship.addCrewMember("Vasco", 1999, 1000.83);
		ship.addCrewMember("Sofia", 2002, 900.75);
		ship.addCrewMember("Pedro", 1985, 700.34);
		ship.addCrewMember("Manel", 1970, 700.34);
		ship.addCrewMember("Joao", 1998, 700.34);

		System.out.println(ship.getCrewMember(2).toString());
		System.out.println(ship.getCrewMember(0).toString());
		System.out.println(ship.getCrewMember(1).toString());

		ship.removeCrewMember(3);
		ship.showCrewMembers();


		System.out.println(ship.getCrewMember(2).toString());
		System.out.println(ship.getCrewMember(4).toString());
		System.out.println(ship.getCrewMember(1).toString());

		ship.showCrewMembers();

		ship.removeAboveAge(1999);

		System.out.println(ship.getCrewMember(2).toString());
		System.out.println(ship.getCrewMember(0).toString());
		System.out.println(ship.getCrewMember(1).toString());

		ship.showCrewMembers();

	}


}