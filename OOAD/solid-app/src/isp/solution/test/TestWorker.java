package isp.solution.test;

import isp.solution.IEat;
import isp.solution.IWork;
import isp.solution.Manger;
import isp.solution.Robot;

public class TestWorker {

	public static void main(String[] args) {
		Robot robot = new Robot();
		Manger manger = new Manger();
		atTheWork(manger);
		atTheWork(robot);

		atTheCafeteria(manger);
		// atTheCafeteria(robot);

	}

	public static void atTheWork(IWork iWorker) {
		System.out.println("At Work");
		iWorker.startWork();
		iWorker.stopWork();
	}

	public static void atTheCafeteria(IEat iEat) {
		System.out.println("At Cafeteria");
		iEat.startEat();
		iEat.stopEat();
	}

}
