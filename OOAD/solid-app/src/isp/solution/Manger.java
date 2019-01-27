package isp.solution;

public class Manger implements IWork, IEat {

	@Override
	public void startWork() {
		System.out.println("Manger Start Work");
	}

	@Override
	public void stopWork() {
		System.out.println("Manger Stop Work");
	}

	@Override
	public void startEat() {
		System.out.println("Manger Start Eat");
	}

	@Override
	public void stopEat() {
		System.out.println("Manger Stop Eat");
	}

}
