package srp.violation;

public class Invoice {
	private int id;
	private String name;
	private double cost;
	private double discount;
	private float gst;
	private double totalTax;
	private double totalDiscount;
	private double totalPrice;

	public Invoice(int id, String name, double cost, double discount, float gst) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.gst = gst;
	}

	public double calculateTax() {
		return gst * cost;

	}

	public double calculateDiscount() {
		return (discount * cost) / 100;

	}

	public double totalPrice() {
		return this.cost - this.calculateDiscount() + this.calculateTax();

	}

	public void printInvoice() {
		System.out.println("Id:" + this.id + " Name:" + this.getName() + " Cost:" + this.getCost()+" Discount:"+this.calculateDiscount() + " Tax:"
				+ this.calculateTax() + " Total Price:" + this.totalPrice());
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public double getDiscount() {
		return discount;
	}

	public float getGst() {
		return gst;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public double getTotalDiscount() {
		return totalDiscount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

}
