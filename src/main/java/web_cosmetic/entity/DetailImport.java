package web_cosmetic.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable
@Table(name = "detail_import")
public class DetailImport {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idImport")
	private ImportReceiptEntity importReceipt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idProduct")
	private ProductEntity product;
	
	@Column
	private int quantity;
	
	@Column
	private double price;
	
	@Column
	private Date created_date;
	
	@Column
	private Date updated_date;
	
	@Column
	private String created_by;
	
	@Column
	private String updated_by;

	public ImportReceiptEntity getImportReceipt() {
		return importReceipt;
	}

	public void setImportReceipt(ImportReceiptEntity importReceipt) {
		this.importReceipt = importReceipt;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
	
}
