public class TestGeneric<U> {
	private U val;

	public TestGeneric(U arg) {
		val = arg;

	}

	public String toString() {
		return "[" + val + "]";
	}
}
