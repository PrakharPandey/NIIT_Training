
public class TestDiamondCase {

	public static void main(String[] args) {
		DiamondCase<Person, Car> d = new DiamondCase(new Person("Prakhar", 25), new Car("Audi", "R8"));
		d.print();

	}

}
