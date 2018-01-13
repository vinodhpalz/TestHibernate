package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Supplier_Details")
public class Supplier {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int supplierId;
private String supplierName;

@OneToMany
private Collection<Product> products = new ArrayList<Product>();


public Collection<Product> getProducts() {
	return products;
}
public void setProducts(Collection<Product> products) {
	this.products = products;
}
public int getSupplierId() {
	return supplierId;
}
public void setSupplierId(int supplierId) {
	this.supplierId = supplierId;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}


}
