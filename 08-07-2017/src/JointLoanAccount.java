import java.util.*;

public class JointLoanAccount extends LoanAccount {
	public JointLoanAccount() {

	}

	public static void main(String[] args) {
		List<? super JointLoanAccount> ac = new ArrayList<LoanAccount>(); // all
																			// super
																			// classes
																			// are
																			// accepted
																			// here
																			// //bounded
																			// type
		List<? extends Account> acc = new ArrayList<LoanAccount>(); // all
																	// subclasses
																	// of
																	// account
																	// are
																	// accepted
																	// here
																	// //bounded
																	// type

		System.out.println(acc.size());
	}
}
