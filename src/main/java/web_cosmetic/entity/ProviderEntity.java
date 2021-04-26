package web_cosmetic.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "provider")
public class ProviderEntity extends BaseEntity {

	@Column
	private String name;
	
	@Column
	private String phone;
	
	@Column
	private String address;
	
	@OneToMany(mappedBy = "provider",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<ImportReceiptEntity> importReceipts = new ArrayList<ImportReceiptEntity>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<ImportReceiptEntity> getImportReceipts() {
		return importReceipts;
	}

	public void setImportReceipts(List<ImportReceiptEntity> importReceipts) {
		this.importReceipts = importReceipts;
	}
	
}
