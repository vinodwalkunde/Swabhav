package srp.violation.test;

import srp.violation.Invoice;

public class TestInvoice {

	public static void main(String[] args) {
		Invoice invoice=new Invoice(1, "Vinod", 200, 10, 0.12f);
		invoice.totalPrice();
		invoice.printInvoice();
	}

}
