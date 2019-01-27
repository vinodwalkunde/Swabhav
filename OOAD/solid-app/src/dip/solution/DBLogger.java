package dip.solution;

public class DBLogger implements ILogable {
	public void log(String message) {
		System.err.println(message);
	}
}
