package com.bosch.whm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	private int product_code;
	private String name;	
	private int currentstock;
	private double weight;
	 private double length;
     private double width;
      private double height;
	public Product(){}
	
	//Created Parameterized constructor
	
	
	//Created getter setter with toString
	public int getCurrentStock() {
		return currentstock;
	}

	public Product(int product_code, String name, int currentStock, double length,
			double width, double height,  double weight) {
		super();
		this.product_code = product_code;
		this.name = name;
		this.currentstock = currentStock;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public void setCurrentStock(int currentStock) {
		this.currentstock = currentStock;
	}

	public int getProductCode() {
		return product_code;
	}

	public void setProductcode(int productCode) {
		this.product_code = productCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
      public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	

}
