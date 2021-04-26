package web_cosmetic.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PromotionProductDTO {

	private int idPromotion;
	private int idProduct;
	private int discountPercent;
	private Date created_date;
	private Date updated_date;
	private String created_by;
	private String updated_by;
	private List<PromotionProductDTO> listResult = new ArrayList<PromotionProductDTO>();
	
	public int getIdPromotion() {
		return idPromotion;
	}
	public void setIdPromotion(int idPromotion) {
		this.idPromotion = idPromotion;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
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
	public List<PromotionProductDTO> getListResult() {
		return listResult;
	}
	public void setListResult(List<PromotionProductDTO> listResult) {
		this.listResult = listResult;
	}
	
}
