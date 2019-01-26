package srp.solution;

public class InvoicePrinter {

	public void printInvoice(Invoice invoice) {
		System.out.println("Id:" + invoice.getId() + " Name:" + invoice.getName() + " Cost:" + invoice.getCost()
				+ " Discount:" + invoice.calculateDiscount() + " Tax:" + invoice.calculateTax() + " Total Price:"
				+ invoice.totalPrice());
	}
}
