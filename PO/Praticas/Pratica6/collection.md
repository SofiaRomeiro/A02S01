# COLLECTIONS

### Iterator

To iterate over a collection we must use an Iterator

	import java.util.Interator;

	Colection<XPTO> _xptos = ...
	Iterator<XPTO> iter = _xptos.iterator() //creating an iterator over _xptos 

	while (iter.hasNext()) {
		XPTO x = iter.next(); // or we can include this line in a for statement
		//do something
	}

In alternative to this iterator, when we don't need to change the vector, we can use the "iterator" like this

	Collection<XPTO> _xptos;

	for (XPTO x : _xptos) {
		//do something
	}

If we want to delete several elements, we **must** use iterator


	Set<String> ex = new HashSet<>();
	ex.add(“abc”);

	ex.add(“def”);
	Iterator<String> iter = ex.iterator();
	while (iter.hasNext()) {
		String str = iter.next();
		if (str.length() > 2)
			iter.remove();
	}


If we just want to remove a single element, it's enough to use the remove() method given by Collection Framework and just break() the iteration after deleting the element.


## Types of Collection

### Set{E}

1. Can't hold 2 equal objects (use equals(Object): boolean)
2. method add(E e) : boolean 
	1. Returns a boolean if Set if modified, false otherwise (ex. the element was already added)
3. **Doesn't keep track of the order** which elements were added -> aranges the elements to provide faster tracking

#### SortedSet{E}

1. Preserves the order of its elements
2. Provides a method to get all elements greater or less than a given one
3. To **specifie the order**
	1. Ordered by their natural order:


			public class Animal implements Comparable<Animal> {
				public int compareTo(Animal a) {
					return _name.compareTo(a.getName());
				}
			}


	2. If we want to compare by 2 different criteria, we can do this:


			public class ComprareAnimalByAgeAndName implements Comparable<Animal> {
				public int compareTo(Animal a1, Animal a2) {
					if (a1.getAge() > a2.getAge) return 1;
					else if (a1.getAge() < a2.getAge()) return -1;
					else return _name.compareTo(a.getName());
				}
			}


#### HashSet{E}

1. Implemets **Set<E>**
2. Uses an **hash table** to speed up : 
	1. Finding (**necessary to check memebership**)
	2. Adding
	3. Removing
3. **Danger** : if the hash code changes, the behaviour is _undefined_
4. **Danger** : if you change an element and that element becomes equal to another, the behaviour is _undefined_. 

5. Membership testing
	1. Invoke the hashCode() on object to add
	2. Invoke equals() to the objects with the same hash code

6. **Overriding** methods
We should override the following methos
	1. equals() : boolean
	2. hashCode() : int


#### TreeSet{E}

1. Implemets **SortedSet<E>**
2. Uses a **binary tree** to speed up : 
	1. Finding (**necessary to check memebership**)
	2. Adding
	3. Removing
3. **Danger** : if you change an element and that element becomes equal to another, the behaviour is _undefined_. 


### List{E}

1. May contain duplicates
2. The insertion order is preserved, add is always made to the end of the list
3. Operators provided
	1. Positional access
	2. Search
	3. Iterator

		ListIterator<E> listIterator()

#### ArrayList{E}

1. Implementation of a list using an array
2. Dinamically allocates memory
3. **Efficient operations**
	1. Access elements by insertion order
	2. Random access
	3. Sequencial access
	4. Add an element to the end
	5. Remove last element
4. **Inefficient operations**
	1. Random modification
	2. Checking membership

#### LinkedList{E}

1. Implementation of a list using a double-linked list

2. **Efficient operations**
	1. Access elements by insertion order
	3. Sequencial access
	4. Add an element to any position
	5. Remove any element
4. **Inefficient operations**
	1. Random modification
	2. Checking membership

### Map{K,V}

1. Object that maps keys to values
2. Can't contain duplicated keys, but can have duplicated values
3. Important methods 
	1. put(K key, V value) : returns previous value or _null_
	2. remove(K key) : V
	3. clear() : void
	4. get(K key) : return the value or _null_
	5. containsKey(K key) : void
	6. size() : int
	7. Set{K} keySet() -> returns a set view of the keys in the map
	8. Collection{K} values() -> returns a collection view with all values in the map
		1. if we change this coolection, we are **changing** the map itself
		
4. **Iterating**
	1. Iterate through keys (ideal): keySet()
	2. Through values : values()
	3. Through pairs : 

		Set<Map.Entry<K,V>>entrySet()

5. **Comparator and Comparable**




#### HashMap{K,V}

1. Uses an hash table
2. Efficient operations:
	1. Get objects by key
	2. If iteration order isn't relevant, it's faster

#### TreeMap{K,V}
1. Uses a tree
2. Guarantees order of iteration through natural ordering or comparator
2. Efficient operations:
	1. Get objects by key













