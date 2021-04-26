package web_cosmetic.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
public class BrandEntity extends BaseEntity {
	
	@Column
	private String name;
	
	@OneToMany(mappedBy = "brand",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<ProductEntity> products = new ArrayList<ProductEntity>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

}
