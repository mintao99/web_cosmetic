package web_cosmetic.dto;

public class FeatureProductDTO extends AbstractDTO<FeatureProductDTO> {

	private int idFeature;
	private int idProduct;
	private String value;
	
	public int getIdFeature() {
		return idFeature;
	}
	public void setIdFeature(int idFeature) {
		this.idFeature = idFeature;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
