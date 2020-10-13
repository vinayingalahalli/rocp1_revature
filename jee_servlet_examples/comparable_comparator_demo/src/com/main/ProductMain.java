package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.comparator.ProductAvailabilityComparator;
import com.model.Product;

public class ProductMain {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(101, "TV", 120.33, 2.55f, true));
		productList.add(new Product(141, "TV", 120.33, 4.55f, true));
		productList.add(new Product(191, "TV", 160.33, 1.55f, true));
		productList.add(new Product(111, "TV", 150.33, 2.55f, false));
		productList.add(new Product(123, "TV", 140.33, 4.55f, false));
		productList.add(new Product(100, "TV", 110.33, 2.55f, true));

		System.out.println("Printing all the TV's");
		printProducts(productList);

		Collections.sort(productList);

		System.out.println("\nPrinting all the TV's sorted based on ID");
		printProducts(productList);

		Collections.sort(productList, new ProductAvailabilityComparator());

		System.out.println("\nPrinting all the TV's sorted based on availability");
		printProducts(productList);

		Collections.sort(productList, (Product p1, Product p2) -> {
			Double d1 = p1.getCost();
			Double d2 = p2.getCost();
			return d1.compareTo(d2);
		});

		System.out.println("\nPrinting all the TV's sorted based on Product's cost");
		printProducts(productList);

		Collections.sort(productList, (Product p1, Product p2) -> {
			Float f1 = p1.getRating();
			Float f2 = p2.getRating();
			int x = f2.compareTo(f1);
			if (x == 0) {
				Double d1 = p1.getCost();
				Double d2 = p2.getCost();
				x = d1.compareTo(d2);
			}
			return x;
		});

		System.out.println(
				"\nPrinting all the TV's sorted based on Product's highest rating & if 2 products have same rating then by lowest cost");
		printProducts(productList);

	}

	public static void printProducts(List<Product> productList) {
		for (Product p : productList) {
			System.out.println(p);
		}
	}
}
//Try the same with your own cutomised object andalso try the same with TreeSet