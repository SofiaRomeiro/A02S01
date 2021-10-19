import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class CompareByLength implements Comparator<String> {	


	public int compare(String o1, String o2) {

		if (o1.length() == o2.length()) {
			System.out.println("compareTo: {" +  o1 + "}, {" + o2 + "}, " + o1.compareTo(o2));
			return o1.compareTo(o2);
		}

		return o1.length() - o2.length();
	}


	public static void main(String[] args) {

		enum Color { GREEN, RED, BLUE};

		Map<String, Color> favoriteColors = new TreeMap<>(new CompareByLength());
		favoriteColors.put("Juliet", Color.BLUE);
		favoriteColors.put("Romeo", Color.GREEN);
		favoriteColors.put("Adam", Color.RED);
		favoriteColors.put("Adan", Color.GREEN);
		favoriteColors.put("Eve", Color.BLUE);

		System.out.println(favoriteColors);

		List<String> newList = new ArrayList<>();
		newList = favoriteColors.toArray(newList);
		newList = sort(favoriteColors);
		System.out.println(newList);

	}

}

