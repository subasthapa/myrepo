import junit.framework.Test;
import junit.framework.TestSuite;

public class Applyjob {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(applyjob.class);
		return suite;
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}
