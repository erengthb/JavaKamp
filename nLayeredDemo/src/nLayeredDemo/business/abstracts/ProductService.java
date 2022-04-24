package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService { // service ler iþ sýnýfýnda olur genelde

	void add(Product product);
	
	List<Product> getAll();
	
	
	
}
