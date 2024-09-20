package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manifacturedDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manifacturedDate) {
		super(name, price);
		this.manifacturedDate = manifacturedDate;
	}

	public Date getManifacturedDate() {
		return manifacturedDate;
	}

	public void setManifacturedDate(Date manifacturedDate) {
		this.manifacturedDate = manifacturedDate;
	}
	
	@Override
	public String priceTag() {
		return getName() + " (used) $ " + getPrice() + " (Manufactured date: " + sdf.format(manifacturedDate) + ")";
	}
}
