package web_cosmetic.dto;

public class OrderDTO extends AbstractDTO<OrderDTO> {

	private int idUser;
	private int status;
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
