package web_cosmetic.dto;

public class ImportReceiptDTO extends AbstractDTO<ImportReceiptDTO> {
	
	private int idUser;
	private int idProvider;
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdProvider() {
		return idProvider;
	}
	public void setIdProvider(int idProvider) {
		this.idProvider = idProvider;
	}
	
	

}
