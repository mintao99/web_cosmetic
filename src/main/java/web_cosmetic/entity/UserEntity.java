package web_cosmetic.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String fullName;
	
	@Column
	private String phone;
	
	@Column
	private String email;
	
	@Column
	private String address;
	
	@OneToMany(mappedBy = "user",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<UserRole> userRoles = new ArrayList<UserRole>();

	@OneToMany(mappedBy = "user",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<ImportReceiptEntity> importReceipts = new ArrayList<ImportReceiptEntity>();
	
	@OneToMany(mappedBy = "user",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<OrderEntity> orders = new ArrayList<OrderEntity>();
	
	@OneToMany(mappedBy = "user",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private Set<CommentEntity> comments;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public List<ImportReceiptEntity> getImportReceipts() {
		return importReceipts;
	}

	public void setImportReceipts(List<ImportReceiptEntity> importReceipts) {
		this.importReceipts = importReceipts;
	}

	public List<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}

	public Set<CommentEntity> getComments() {
		return comments;
	}

	public void setComments(Set<CommentEntity> comments) {
		this.comments = comments;
	}
	
}
