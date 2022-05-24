package services;

import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

import services.ServiceBasicUser;

import services.ServiceLaptops;
import services.ServicePhones;
import services.ServiceSwitches;
import services.ServiceTVs;
import services.ServiceWifiRouters;

import csvs.Log;
import daos.AdminDao;
import daos.BasicUserDao;
import models.Admin;
import models.BasicUser;

public class ServiceAdmin {
	
	ServiceBasicUser serviceBasicUsers = new ServiceBasicUser();
    ServiceLaptops servicelaptops = new ServiceLaptops();
    ServicePhones servicephones = new ServicePhones();
    ServiceSwitches serviceswitches = new ServiceSwitches();
    ServiceWifiRouters servicewifirouters = new ServiceWifiRouters();
    ServiceTVs servicetvs = new ServiceTVs();
    AdminDao adminDao = new AdminDao();
    
    public void createBasicUser(BasicUser user) {
    	try {
			serviceBasicUsers.addBasicUser(user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void deleteUserByName(String name) {
    	try {
			serviceBasicUsers.removeBasicUserByName(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public void addNewLaptop() throws IOException {
    	servicelaptops.addLaptop(null);
    }
    
    public void addNewPhone() {
    	try {
			servicephones.addPhone(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void addNewSwitch() {
    	try {
			serviceswitches.addSwitch(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void addNewWifiRouter() {
    	servicewifirouters.addWifiRouter(null);
    }
    
    public void addNewTV() {
    	servicetvs.addTV(null);
    }
    
    public void deleteLaptopByName(String name) {
    	try {
			serviceBasicUsers.removeBasicUserByName(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public void deletePhoneByName(String name) {
    	servicephones.removePhoneByBrand(name);;
    	
    }
    
    public void deleteSwitchByName(String name) {
    	try {
			serviceswitches.removeSwitchByName(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public void deleteWifiRouterByName(String name) {
    	servicewifirouters.removeWifiRouterByName(name);
    	
    }
    
    public void deleteTVByName(String name) {
    	servicetvs.removeTVByName(name);
    	
    }

	public void addAdmin(Admin admin) {
		adminDao.save(admin);
		
	}
    
}


