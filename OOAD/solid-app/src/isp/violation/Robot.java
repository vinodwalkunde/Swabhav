package isp.violation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot Start Work");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stop Work");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot can't Eat");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robot can't Eat");

	}

}
