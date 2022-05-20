package models;

import java.io.IOException;

public class Admin extends User{
    private int idAdmin;
    private static int idAdminIndex = 1;

    public Admin(String name, String password, String emailAddress) {
        super(name, password, emailAddress);
    	this.idAdmin = idAdminIndex;
    	idAdminIndex++;
        
    }
    
}
