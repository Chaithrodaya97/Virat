package day7;

public class Product 
{
	private String productName;
	private int productId;
	private int price;
	
	@Override
	public String toString() {
		return "product [productName=" + productName + ", productId=" + productId + ", price=" + price + "]";
	}

	

	public Product(String productName, int productId, int price) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.price = price;
	}



	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
