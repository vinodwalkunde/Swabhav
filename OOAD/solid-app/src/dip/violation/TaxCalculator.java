package dip.violation;

public class TaxCalculator {
	private LogType log;

	public TaxCalculator(LogType log) {
		this.log = log;
	}

	public void calculateTax(int amount, int rate) {
		try {
			rate = amount / rate;
		} catch (Exception ex) {
			String ms=ex.getMessage();
			if(this.log==LogType.DB) {
				new DBLogger().log("Please Login DB");
			}else {
				new XMLLogger().log("Please Login XML");
			}
				
		}
	}
}
