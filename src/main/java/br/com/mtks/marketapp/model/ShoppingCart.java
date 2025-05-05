package br.com.mtks.marketapp.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "shopping_cart")
public class ShoppingCart
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private LocalDate date;
	@Column(length = 50, name = "market_name", nullable = false)
	private String marketName;
	@Column(name = "total_price")
	private Double totalPrice;
	private Integer status;
	@OneToMany(mappedBy = "shoppingCart", cascade = CascadeType.ALL)
	private List<ShoppingCartItem> items;
}
