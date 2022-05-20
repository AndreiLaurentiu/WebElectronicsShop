package models;

public abstract class User implements Comparable<User>{
    private int idUser;
    private static int idUserIndex = 1;
    private String username;
    private String password;
    private String emailAddress;
   
    public User(String username, String password, String emailAddress) {
    	this.idUser = idUserIndex;
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
        idUserIndex++;
    }
    
    public String toString() {
    	return idUser + " " + username + " " + password + " " + emailAddress + "\n";
    }

	@Override
	public int compareTo(User user) {
		if(idUser == user.getidUser())
			return 0;
		else if(idUser > user.getidUser())
			return 1;
		else
			return -1;
	}
	
	public int getidUser() {
		return idUser;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return emailAddress;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setEmail(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
