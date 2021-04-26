package web_cosmetic.dto;

import java.util.Date;

public class PromotionDTO extends AbstractDTO<PromotionDTO> {

	private String promotionName;
	private Date begin;
	private Date end;
	
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
	
}
