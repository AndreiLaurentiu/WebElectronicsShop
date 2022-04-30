package products;

public class Admin extends User{
    private int idAdmin;
    

    public Admin(int idAdmin, String name, String password, String emailAddress) {
        super(idAdmin, name, password, emailAddress);
    	this.idAdmin = idAdmin;
        
    }
    
    
}
