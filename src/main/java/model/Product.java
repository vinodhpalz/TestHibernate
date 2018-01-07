package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// This is a product class
@Entity
@Table
public class Product {
	@Id
	private int productId;
	private String productName;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}
