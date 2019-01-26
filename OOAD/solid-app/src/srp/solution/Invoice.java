package srp.solution;

public class Invoice {
	private int id;
	private String name;
	private double cost;
	private double discount;
	private float gst;
	

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

	

}
