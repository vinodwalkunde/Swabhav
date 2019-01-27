package dip.solution;

public class TaxCalculator {
	private ILogable iLogable;

	public TaxCalculator(ILogable iLogable) {
		this.iLogable = iLogable;
	}

	public int calculateTax(int amount, int rate) {
		try {
			return rate = amount / rate;
		} catch (Exception ex) {
			String ms = ex.getMessage();
			if (iLogable instanceof DBLogger) {
				ILogable dbLogger = new DBLogger();
				dbLogger.log("Please Login DB");
			} else {
				ILogable xmlLogger = new XMLLogger();
				xmlLogger.log("Please login XML");
			}

		}
		return rate;
	}
}
