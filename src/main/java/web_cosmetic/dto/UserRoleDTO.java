package web_cosmetic.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRoleDTO {

	private int idUser;
	private int idRole;
	private Date created_date;
	private Date updated_date;
	private String created_by;
	private String updated_by;
	private List<UserRoleDTO> listResult = new ArrayList<UserRoleDTO>();
}
