package com.comparator;

import java.util.Comparator;

import com.model.Product;

public class ProductAvailabilityComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		Boolean b1=o1.isAvialability();
		Boolean b2=o2.isAvialability();
		return b2.compareTo(b1);
	}

}
