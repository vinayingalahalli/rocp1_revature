package com.model;

public class Product implements Comparable<Product>{

	private int id;
	private String name;
	private double cost;
	private float rating;
	private boolean avialability;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public boolean isAvialability() {
		return avialability;
	}

	public void setAvialability(boolean avialability) {
		this.avialability = avialability;
	}

	public Product(int id, String name, double cost, float rating, boolean avialability) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.rating = rating;
		this.avialability = avialability;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", rating=" + rating + ", avialability="
				+ avialability + "]";
	}

	@Override
	public int compareTo(Product o) {
		Integer i1=this.id;
		Integer i2=o.id;
		return i1.compareTo(i2);
	}
	
	
}
