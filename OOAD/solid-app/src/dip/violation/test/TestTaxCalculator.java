package dip.violation.test;

import dip.violation.LogType;
import dip.violation.TaxCalculator;

public class TestTaxCalculator {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator(LogType.DB);
		taxCalculator.calculateTax(0, 0);
	}
}
