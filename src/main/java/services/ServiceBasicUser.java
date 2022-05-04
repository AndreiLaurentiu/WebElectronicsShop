package services;

import java.util.Comparator;
import java.util.LinkedList;

import daos.BasicUserDao;
import products.BasicUser;

public class ServiceBasicUser {
	private BasicUserDao basicuserdao = new BasicUserDao();
	
	
	public void addLaptop(BasicUser user) {
		basicuserdao.save(user);
    }
	
	public void printListBasicUsers() {
		basicuserdao.getAll().forEach(System.out::println);
    }
	
	public void removeBasicUserByIndex(int index) {
		basicuserdao.deleteByIndex(index);
    }
    public void removeBasicUserByName(String username) {
    	basicuserdao.deleteBasicUserByName(username);
    }
    
   public void printListBasicUsersByName() {
	   basicuserdao.getAll().stream()
	.sorted(Comparator.comparing(BasicUser::getUsername))
	.forEach(System.out::println);
   }
    
    public LinkedList<BasicUser> getArrayOfBasicUsers(){
    	return basicuserdao.getAll();
    }
}
