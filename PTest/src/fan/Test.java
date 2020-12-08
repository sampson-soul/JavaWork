package fan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {
/*	public static <T> void DisplayArray(T[] anArray) {
		
		for(T t:anArray) {
			System.out.println(t);
			System.out.println("----");
		}
		for(K k:twoArray) {
			System.out.println(k);
			System.out.println("----");
		}
	}
*/		
	public static void main(String[] args) {		
/*		  String[] strArray = {"ABC","DEF","HIJ"}; DisplayArray(strArray);
		  
		  Integer[] intArray= {1,2,3,4,5}; DisplayArray(intArray);
		  
		  Car[] carArray = new Car[2]; carArray[0] = new Car("±¼³Û",3,4); carArray[1] =
		  new Car("±¦Âí",3,4); DisplayArray(carArray);
		 
		
		
		 Map<Integer,String> map=new HashMap<>(); map.put(2, "ABC"); map.put(4,
		 "6666"); System.out.println(map.get(4));
		 
		 Map<String,Car> carmap=new HashMap<String,Car>(); carmap.put("±¼³Û", new
		 Car("±¼³Û",3,4)); carmap.put("±¦Âí", new Car("±¦Âí",1,3));
		 System.out.println(carmap.get("±¼³Û")); System.out.println(carmap.size());
*/			 
	
		Generator fg = new newGenerator<String>();
		for(int i=0;i<10;i++)
			System.out.println(fg.next());
		}

}
