package br.com.mtks.marketapp.service;

import br.com.mtks.marketapp.model.Product;
import java.util.List;

public interface ProductService
{
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> findAll();

	List<Product> findByKeyword(String keyword);

	Product findById(Integer id);
}
