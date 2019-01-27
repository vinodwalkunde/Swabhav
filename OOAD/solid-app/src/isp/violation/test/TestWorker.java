package isp.violation.test;

import isp.violation.IWorker;
import isp.violation.Manger;
import isp.violation.Robot;

public class TestWorker {
	public static void main(String[] args) {
		Robot robot = new Robot();
		Manger manger = new Manger();
		atTheWork(manger);
		atTheWork(robot);
		
		atTheCafeteria(manger);
		atTheCafeteria(robot);//voilation of lsp
	}

	public static void atTheWork(IWorker iWorker) {
		System.out.println("At Work");
		iWorker.startWork();
		iWorker.stopWork();
	}

	public static void atTheCafeteria(IWorker iWorker) {
		System.out.println("At Cafeteria");
		iWorker.startEat();
		iWorker.stopEat();
	}
}
