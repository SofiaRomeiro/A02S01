/*
-------------------------------------
				Caneta 
-------------------------------------

- _maxInkCapacity: int
- _brand: String
- _color: String
- _currentAvailableInk: int

-------------------------------------

+ getColor(): String
+ getAvailableInk(): int
+ write(text: String)
+ recharge(rechargeAmount: int) : int

--------------------------------------
*/

public class Caneta {

	public void write(String text) {
		if (_currentAvailableInk > 0) {
			System.out.println(text);
			int inkLeft = _currentAvailableInk - text.length();
		}

		_currentAvailableInk = ( inkLeft < 0 ? 0 : inkLeft );

		

	}
}