package web_cosmetic.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DetailOrderDTO {
	
	private int idOrder;
	private int idProduct;
	private int quantity;
	private Date created_date;
	private Date updated_date;
	private String created_by;
	private String updated_by;
	private List<DetailOrderDTO> listResult = new ArrayList<DetailOrderDTO>();
	public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
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
	public List<DetailOrderDTO> getListResult() {
		return listResult;
	}
	public void setListResult(List<DetailOrderDTO> listResult) {
		this.listResult = listResult;
	}
	
}
