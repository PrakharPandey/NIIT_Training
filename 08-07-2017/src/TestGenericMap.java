
public class TestGenericMap {

	public static void main(String[] args) {
		Person p = new Person("Prakhar", 24);
		Car c = new Car("Audi", "R8");
		Person p1 = new Person("Shikhar", 23);
		Car c1 = new Car("Mercedes", "S Class");
		Person p2 = new Person("Rishabh", 25);
		Car c2 = new Car("Bugatti", "Veyron");
		GenericMap.fill(p, c);
		GenericMap.fill(p1, c1);
		GenericMap.fill(p2, c2);

	}

}
