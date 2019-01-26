package srp.solution.test;

import srp.solution.Invoice;
import srp.solution.InvoicePrinter;

public class TestInvoice {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, "Vinod", 100, 10, 0.12f);
		InvoicePrinter invoicePrinter = new InvoicePrinter();
		invoicePrinter.printInvoice(invoice);
	}

}
