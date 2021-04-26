package web_cosmetic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "promotion")
public class PromotionEntity extends BaseEntity {
	
	@Column
	private String promotionName;
	
	@Column
	private Date begin;
	
	@Column
	private Date end;
	
	@OneToMany(mappedBy = "promotion",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<PromotionProduct> promotionProducts = new ArrayList<PromotionProduct>();

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public List<PromotionProduct> getPromotionProducts() {
		return promotionProducts;
	}

	public void setPromotionProducts(List<PromotionProduct> promotionProducts) {
		this.promotionProducts = promotionProducts;
	}
	
}
