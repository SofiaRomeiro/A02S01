package ex.core;

/**
 * This class is the single core entity of this small example. It holds a list of int numbers.
 **/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class IntegerManager {
    private List<Integer> _numbers;

    public IntegerManager() {
        _numbers = new ArrayList<>();
    }

    public boolean addNumber(Integer n) {
        if (_numbers.contains(n))
          return false;

        _numbers.add(n);
	return true;
    }

    public boolean removeNumber(Integer n) {

        return _numbers.remove(n);
    }

    public void insertNumber(int index, Integer n) {
        _numbers.add(index, n);
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(_numbers);
    }
}
