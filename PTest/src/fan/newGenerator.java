package fan;

import java.util.Random;

public class newGenerator<T> implements Generator<T> {
	
	private String[] fruits = new String[] {"Apple","Banana","Pear"};
	public T next() {
		Random rm = new Random();
		return (T)fruits[rm.nextInt(fruits.length)];
	}

}
