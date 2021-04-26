package web_cosmetic.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {

	@Column
	private String role;
	
	@Column
	private String name;
	
	@OneToMany(mappedBy = "role",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<UserRole> RoleUsers = new ArrayList<UserRole>();

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
