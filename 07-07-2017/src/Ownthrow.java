
public class Ownthrow extends Exception{

	public Ownthrow(String d) {
		super(d);
	}

	public String getMessage() {
		
	return "CompileTime "+super.getMessage();
	}
}
