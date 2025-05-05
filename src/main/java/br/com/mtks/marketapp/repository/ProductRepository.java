package br.com.mtks.marketapp.repository;

import br.com.mtks.marketapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>
{
}
