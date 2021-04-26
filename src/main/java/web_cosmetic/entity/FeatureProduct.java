package web_cosmetic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "feature_product")
public class FeatureProduct extends BaseEntity {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idFeature")
	private FeatureEntity feature;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idProduct")
	private ProductEntity product;
	
	@Column
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public FeatureEntity getFeature() {
		return feature;
	}

	public void setFeature(FeatureEntity feature) {
		this.feature = feature;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	

}
