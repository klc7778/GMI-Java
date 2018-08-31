import java.util.Arrays;

public class Product {
	
	int productCode;
	String name;
	String brand;
	double price;
	int avail_Stock;
	
	String[] prod_details;
	/*
	 * constructor that takes in the array of product details 
	 */
	public Product(String[] prod_details) {
		super();
		this.prod_details = prod_details;
	}

	/*
	 * Getter methods 
	 */
	public int getProductCode() {
		return productCode;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public int getAvail_Stock() {
		return avail_Stock;
	}

	public String[] getProd_details() {
		return prod_details;
	}
	
	/*
	 * SETTERS
	 */
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAvail_Stock(int avail_Stock) {
		this.avail_Stock = avail_Stock;
	}

	public void setProd_details(String[] prod_details) {
		this.prod_details = prod_details;
	}

	/*
	 * override toString method to print out all of the details 
	 * associated with Product
	 */
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", name=" + name + ", brand=" + brand + ", price=" + price
				+ ", avail_Stock=" + avail_Stock + ", prod_details=" + Arrays.toString(prod_details) + "]";
	}
	
	

}
