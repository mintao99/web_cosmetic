package web_cosmetic.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {
	
	@Column
	private String name;
	
	@Column
	private double price;
	
	@Column
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCategory")
	private CategoryEntity category;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idBrand")
	private BrandEntity brand;
	
	@OneToMany(mappedBy = "product",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<ImageEntity> images = new ArrayList<ImageEntity>();

	@OneToMany(mappedBy = "product",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<LotEntity> lots = new ArrayList<LotEntity>();
	
	@OneToMany(mappedBy = "product",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<FeatureProduct> productFeatures = new ArrayList<FeatureProduct>();
	
	@OneToMany(mappedBy = "product",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<PromotionProduct> productPromotions = new ArrayList<PromotionProduct>();
	
	@OneToMany(mappedBy = "product",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<CommentEntity> comments = new ArrayList<CommentEntity>();
	
	@OneToMany(mappedBy = "product",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<DetailOrder> detailOrders = new ArrayList<DetailOrder>();
	
	@OneToMany(mappedBy = "product",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<DetailImport> detailImports = new ArrayList<DetailImport>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BrandEntity getBrand() {
		return brand;
	}

	public void setBrand(BrandEntity brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<ImageEntity> getImages() {
		return images;
	}

	public void setImages(List<ImageEntity> images) {
		this.images = images;
	}

	public double getPrice() {
		return price;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public List<LotEntity> getLots() {
		return lots;
	}

	public void setLots(List<LotEntity> lots) {
		this.lots = lots;
	}

	public List<FeatureProduct> getProductFeatures() {
		return productFeatures;
	}

	public void setProductFeatures(List<FeatureProduct> productFeatures) {
		this.productFeatures = productFeatures;
	}

	public List<PromotionProduct> getProductPromotions() {
		return productPromotions;
	}

	public void setProductPromotions(List<PromotionProduct> productPromotions) {
		this.productPromotions = productPromotions;
	}

	public List<CommentEntity> getComments() {
		return comments;
	}

	public void setComments(List<CommentEntity> comments) {
		this.comments = comments;
	}

	public List<DetailOrder> getDetailOrders() {
		return detailOrders;
	}

	public void setDetailOrders(List<DetailOrder> detailOrders) {
		this.detailOrders = detailOrders;
	}

	public List<DetailImport> getDetailImports() {
		return detailImports;
	}

	public void setDetailImports(List<DetailImport> detailImports) {
		this.detailImports = detailImports;
	}
	
}
