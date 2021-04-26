package web_cosmetic.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "status")
public class StatusEntity extends BaseEntity {

	@Column
	private String name;
	
	@OneToMany(mappedBy = "status",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<OrderEntity> orders = new ArrayList<OrderEntity>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}

}
