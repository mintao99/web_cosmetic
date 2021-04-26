package web_cosmetic.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lot")
public class LotEntity {
	
	@Id
	private String lotNumber;
	
	@Column
	private Date mfg_date;
	
	@Column
	private Date exp_date;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idProduct")
	private ProductEntity product;
	
	@Column
	private int quantity;
	
	@Column
	private Date created_date;
	
	@Column
	private Date updated_date;
	
	@Column
	private String created_by;
	
	@Column
	private String updated_by;

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public Date getMfg_date() {
		return mfg_date;
	}

	public void setMfg_date(Date mfg_date) {
		this.mfg_date = mfg_date;
	}

	public Date getExp_date() {
		return exp_date;
	}

	public void setExp_date(Date exp_date) {
		this.exp_date = exp_date;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	
}
