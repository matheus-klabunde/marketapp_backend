package br.com.mtks.marketapp.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import br.com.mtks.marketapp.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class ProductServiceTest
{
	@Autowired
	private ProductService productService;

	@Test
	void shouldStoreProduct()
	{
		Product product = new Product();
		product.setName("Bolacha");
		assertNotNull(productService.createProduct(product));
	}
}