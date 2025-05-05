package br.com.mtks.marketapp.service;

import br.com.mtks.marketapp.model.Product;
import br.com.mtks.marketapp.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService
{
	private final ProductRepository productRepository;

	@Autowired
	public ProductServiceImpl(ProductRepository productRepository)
	{
		this.productRepository = productRepository;
	}

	@Override
	public Product createProduct(Product product)
	{
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product)
	{
		return productRepository.save(product);
	}

	@Override
	public List<Product> findAll()
	{
		return List.of();
	}

	@Override
	public List<Product> findByKeyword(String keyword)
	{
		return List.of();
	}

	@Override
	public Product findById(Integer id)
	{
		return null;
	}
}
