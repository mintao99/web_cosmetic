package web_cosmetic.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotDTO {

	private String lot_number;
	private Date mfg_date;
	private Date exp_date;
	private int id_product;
	private int quantity;
	private Date created_date;
	private Date updated_date;
	private String created_by;
	private String updated_by;
	private List<LotDTO> listResult = new ArrayList<LotDTO>();
	
	public String getLot_number() {
		return lot_number;
	}
	public void setLot_number(String lot_number) {
		this.lot_number = lot_number;
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
	public int getId_product() {
		return id_product;
	}
	public void setId_product(int id_product) {
		this.id_product = id_product;
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
	public List<LotDTO> getListResult() {
		return listResult;
	}
	public void setListResult(List<LotDTO> listResult) {
		this.listResult = listResult;
	}
	
	
}
