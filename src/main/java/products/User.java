package products;

public abstract class User implements Comparable<User>{
    private int idUser;
    private String username;
    private String password;
    private String emailAddress;
   
    public User(int idUser, String username, String password, String emailAddress) {
    	this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
    }

    public void addProductInOrder(Order order, Product product){
        order.addProduct(product);
    }

    public void chooseDeliveryService(Courier courier, String deliveryDate){
        if(courier.acceptDelivery(deliveryDate))
            System.out.println("Comanda a fost plasata cu succes.");
        else
            System.out.println("Va rugam introduceti alta data.");
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
	
}
