package ocp.solution.test;

import ocp.solution.FixedDeposit;
import ocp.solution.NewYear;
import ocp.solution.NormalFestival;

public class TestFixedDeposite {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit=new FixedDeposit(1, "Vinod", 10000, 1, new NormalFestival());
		System.out.println(fixedDeposit.calculateSimpleInterest());
		FixedDeposit fixedDeposit2=new FixedDeposit(2, "Rohit", 10000, 2, new NewYear());
		System.out.println(fixedDeposit2.calculateSimpleInterest());
	}

}
