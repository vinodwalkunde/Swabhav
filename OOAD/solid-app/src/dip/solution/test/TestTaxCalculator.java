package dip.solution.test;

import dip.solution.DBLogger;
import dip.solution.TaxCalculator;
import dip.solution.XMLLogger;

public class TestTaxCalculator {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator(new DBLogger());
		System.out.println(taxCalculator.calculateTax(0, 0));
		
		TaxCalculator taxCalculator1 = new TaxCalculator(new XMLLogger());
		System.out.println(taxCalculator1.calculateTax(0, 0));
	}
}
