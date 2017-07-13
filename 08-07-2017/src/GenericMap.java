import java.util.HashMap;
import java.util.Map;

public class GenericMap {
	public static <T, U> void fill(T t, U u) {
		HashMap<T, U> al = new HashMap<T, U>();
		al.put(t, u);

		for (Map.Entry<T, U> ca : al.entrySet()) // Traversing HashMap
		{
			System.out.println("Key: " + ca.getKey() + " Value: " + ca.getValue());

		}
	}

}
