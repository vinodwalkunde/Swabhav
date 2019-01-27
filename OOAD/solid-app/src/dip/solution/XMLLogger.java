package dip.solution;

public class XMLLogger implements ILogable {
	public void log(String message) {
		System.err.println(message);
	}
}
