package nLayeredDemo.entities.concretes;  //concrete somut s�n�flar�n yaz�ld��� pakettir.

import nLayeredDemo.entities.abstracts.Entity;  // ba�ka bir paketteki operasyonu kullanmak i�in import edilir

public class Product implements Entity {  // abstracts taki Entity interfacesini implemente ediyoruz.
	
	private int id ;
	private  int categoryId;
	private String name ;
	private double unitPrice;
	private int unitsInStock;
	
	
	public Product () {
		
		
		
	}


	public Product(int id, int categoryId, String name, double unitPrice, int unitsInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public int getUnitsInStock() {
		return unitsInStock;
	}


	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	
	

}
