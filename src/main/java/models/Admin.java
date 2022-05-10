package models;

import java.io.IOException;

import services.ServiceBasicUser;

import services.ServiceLaptops;
import services.ServicePhones;
import services.ServiceSwitches;
import services.ServiceTVs;
import services.ServiceWifiRouters;

public class Admin extends User{
    private int idAdmin;
    private static int idAdminIndex = 1;
    
    ServiceBasicUser serviceBasicUsers = new ServiceBasicUser();
    ServiceLaptops servicelaptops = new ServiceLaptops();
    ServicePhones servicephones = new ServicePhones();
    ServiceSwitches serviceswitches = new ServiceSwitches();
    ServiceWifiRouters servicewifirouters = new ServiceWifiRouters();
    ServiceTVs servicetvs = new ServiceTVs();

    public Admin(String name, String password, String emailAddress) {
        super(name, password, emailAddress);
    	this.idAdmin = idAdminIndex;
    	idAdminIndex++;
        
    }
    
    public void createBasicUser(BasicUser user) {
    	serviceBasicUsers.addBasicUser(user);
    }
    
    public void deleteUserByName(String name) {
    	serviceBasicUsers.removeBasicUserByName(name);
    	
    }
    
    public void addNewLaptop() throws IOException {
    	servicelaptops.addLaptop(null);
    }
    
    public void addNewPhone() {
    	servicephones.addPhone(null);
    }
    
    public void addNewSwitch() {
    	serviceswitches.addSwitch(null);
    }
    
    public void addNewWifiRouter() {
    	servicewifirouters.addWifiRouter(null);
    }
    
    public void addNewTV() {
    	servicetvs.addTV(null);
    }
    
    public void deleteLaptopByName(String name) {
    	serviceBasicUsers.removeBasicUserByName(name);
    	
    }
    
    public void deletePhoneByName(String name) {
    	servicephones.removePhoneByBrand(name);;
    	
    }
    
    public void deleteSwitchByName(String name) {
    	serviceswitches.removeSwitchByName(name);
    	
    }
    
    public void deleteWifiRouterByName(String name) {
    	servicewifirouters.removeWifiRouterByName(name);
    	
    }
    
    public void deleteTVByName(String name) {
    	servicetvs.removeTVByName(name);
    	
    }
    
    //TODO: add update & read methods for all models
    
}
