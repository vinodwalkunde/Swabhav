package isp.solution;

public class Robot implements IWork {

	@Override
	public void startWork() {
		System.out.println("Robot Start Work");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stop Work");
	}

}
