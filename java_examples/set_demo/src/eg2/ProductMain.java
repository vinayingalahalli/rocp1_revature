package eg2;

import java.util.HashSet;
import java.util.Set;

public class ProductMain {

	public static void main(String[] args) {
		
		Set<Product> productsList=new HashSet<>();
		productsList.add(new Product(900, "TV", 122.22, 2.3f));
		productsList.add(new Product(120, "TV", 122.22, 2.3f));
		productsList.add(new Product(100, "TV", 122.22, 2.3f));
		productsList.add(new Product(100, "TV", 122.22, 2.3f));
		productsList.add(new Product(100, "TV", 122.22, 2.3f));
		productsList.add(new Product(101, "TV", 122.22, 2.3f));
		
		System.out.println("Printing all product/s");
		printProducts(productsList);

	}
	
	public static void printProducts(Set<Product> productsList) {
		for(Product p:productsList) {
			System.out.println(p);
		}
	}

}
