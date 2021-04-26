package web_cosmetic.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "feature")
public class FeatureEntity extends BaseEntity {
	
	@Column
	private String name;
	
	@OneToMany(mappedBy = "feature",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<FeatureProduct> featureProducts = new ArrayList<FeatureProduct>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
