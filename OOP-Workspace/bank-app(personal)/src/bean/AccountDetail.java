package bean;

public class AccountDetail {
	private String name;
	private String adress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String toString() {
		return name + " " + adress;

	}

}
