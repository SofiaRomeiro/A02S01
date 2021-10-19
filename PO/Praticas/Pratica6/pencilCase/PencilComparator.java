package pencilCase;

import java.util.Comparator;

public class PencilComparator implements Comparator<Pencil> {

	public int compare(Pencil p1, Pencil p2) {

		if (p1.getBrand().compareTo(p2.getBrand()) > 1) {
			return 1;
		}
		else if (p1.getBrand().compareTo(p2.getBrand()) < -1) {
			return -1;
		}
		else {
			return p1.getColor().compareTo(p2.getColor());
		}
	}
}