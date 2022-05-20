package models;

public class Courier {
	private int idCourierIndex;
    private int idCourier;
    private String username;
    private String password;
    private String cellPhoneNumber;

    public Courier(String username, String password, String cellPhoneNumber) {
        this.idCourier = idCourier;
        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
        idCourierIndex++;
    }

	public int getIdCourierIndex() {
		return idCourierIndex;
	}

	public void setIdCourierIndex(int idCourierIndex) {
		this.idCourierIndex = idCourierIndex;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

    
    
}
