package streamtut.groupby;

public class SaleData {

	String name;
	String city;
	int numSale;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNumSale() {
		return numSale;
	}

	public void setNumSale(int numSale) {
		this.numSale = numSale;
	}

	public SaleData(String name, String city, int numSale) {
		super();
		this.name = name;
		this.city = city;
		this.numSale = numSale;
	}
}
