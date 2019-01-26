package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class TestFixedDeposit {
	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(1, "Vinod", 100000, FestivalType.HOLI, 1);
		System.out.println(fixedDeposit.calculateSimpleInterest());
	}

}
