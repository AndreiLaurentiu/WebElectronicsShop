package models;

public class BasicUser extends User{
	private int idBasicUser;
    private int idBasicUserIndex = 1;

    public BasicUser(String name, String password, String emailAddress) {
        super(name, password, emailAddress);
    	this.idBasicUser = idBasicUserIndex;
    	idBasicUserIndex++;
        
    }
}
