package models;

import java.io.IOException;

import csvs.Log;
import csvs.ReadCSV;
import csvs.WriteCSV;
import jdbc.DBConnection;
import jdbc.ReadDB;
import services.ServiceAdmin;
import services.ServiceBasicUser;
import services.ServiceCourier;
import services.ServiceLaptops;
import services.ServicePhones;
import services.ServiceSwitches;
import services.ServiceTVs;

public class Main {
	public static void main(String[] args) throws IOException {
    	
    	BasicUser user1 = new BasicUser("Andrei", "pass1", "andrei@gmail.com");
    	BasicUser user2 = new BasicUser("Laur", "pass2", "laur@gmail.com");
    	
    	Laptop laptop1 = new Laptop("ASUS X515MA", "Asus", 2, "36.02 cm x 23.49 cm x 1.99 cm", "grey",1200, "Intel Celeron N4020",
    			"1.10GHz", "256GB", "4GB", "45% NTSC\r\n"
    					+ "Anti-Glare\r\n"
    					+ "LED\r\n"
    					+ "Luminosity 200 Niti\r\n"
    					+ "Truelife", 15.6f, "802.11a/b/g/n/ac", "Bluetooth 4.1", "2 x USB 2.0, 1 x HDMI, "
    							+ "Microphone", "Stereo Speackers\r\n"
    									+ "Technology ASUS SonicMaster", "VGA", "2 cells\r\n"
    											+ "37 Whr\r\n"
    											+ "Lithium Ion", "None included", "6W", "4MB", "Intel UHD Graphics",
    											"Integrated", "Without Touchscreen", "1920 x 1080", "1 x Slot M2", 
    											"microSD", "yes", "no", "https://s1.cel.ro/images/Products/2021/08/05/Laptop-ASUS-X515MA-Intel-Celeron-N4020-256GB-SSD-4GB-FullHD-Transparent-Silver.jpg");
    	Laptop laptop2 = new Laptop("ASUS X515MA", "Bsus", 2, "36.02 cm x 23.49 cm x 1.99 cm", "grey",1200, "Intel Celeron N4020",
    			"1.10GHz", "256GB", "4GB", "45% NTSC\r\n"
    					+ "Anti-Glare\r\n"
    					+ "LED\r\n"
    					+ "Luminosity 200 Niti\r\n"
    					+ "Truelife", 15.6f, "802.11a/b/g/n/ac", "Bluetooth 4.1", "2 x USB 2.0, 1 x HDMI, "
    							+ "Microphone", "Stereo Speackers\r\n"
    									+ "Technology ASUS SonicMaster", "VGA", "2 cells\r\n"
    											+ "37 Whr\r\n"
    											+ "Lithium Ion", "None included", "6W", "4MB", "Intel UHD Graphics",
    											"Integrated", "Without Touchscreen", "1920 x 1080", "1 x Slot M2", 
    											"microSD", "yes", "no", "https://s1.cel.ro/images/Products/2021/08/05/Laptop-ASUS-X515MA-Intel-Celeron-N4020-256GB-SSD-4GB-FullHD-Transparent-Silver.jpg");
    	Phone phone1 = new Phone("APPLE IPHONE 6S 32GB", "Apple", 0.143f, "138.3 x 67.1 x 7.1 mm", "black", 600, "A9 chip with 64-bit architecture", "-", 
    			"32GB", "2GB", "Touchscreen Capacitiv", 4.7f, "Wi Fi", "4.2, A2DP, LE", "Lightning connector 3.5 mm jack", "Speaker", "primary camera resolution 12", "Li-Po 1715 mAh battery (6.9 Wh), fixed", "iOS 9", "no", "no", "with 3G",
    					"with 4G", "yes", "802.11 a/b/g/n/ac, dual-band, hotspot", "-", "750 x 1334 pixels (~326 ppi pixel density)", "without card", "Accelerometer, gyro, proximity, compass, barometer", "https://s1.cel.ro/images/Products/telefon-mobil-apple-iphone-6s-32gb-space-grey.jpg");
    	Phone phone2 = new Phone("APPLE IPHONE 6S 64GB", "Apple", 0.143f, "138.3 x 67.1 x 7.1 mm", "black", 800, "A9 chip with 64-bit architecture", "-", 
    			"64GB", "2GB", "Touchscreen Capacitiv", 4.7f, "Wi Fi", "4.2, A2DP, LE", "Lightning connector 3.5 mm jack", "Speaker", "primary camera resolution 12", "Li-Po 1715 mAh battery (6.9 Wh), fixed", "iOS 9", "no", "no", "with 3G",
    					"with 4G", "yes", "802.11 a/b/g/n/ac, dual-band, hotspot", "-", "750 x 1334 pixels (~326 ppi pixel density)", "without card", "Accelerometer, gyro, proximity, compass, barometer", "https://s1.cel.ro/images/Products/telefon-mobil-apple-iphone-6s-32gb-space-grey.jpg");
    
    	
    	
    	ServiceLaptops servicelaptops = new ServiceLaptops();
    	servicelaptops.addLaptop(laptop2);
    	servicelaptops.addLaptop(laptop1);
    	servicelaptops.printListLaptopsByBrand();
    	servicelaptops.printListLaptops();
    	ServicePhones servicephones = new ServicePhones();
    	servicephones.addPhone(phone2);
    	servicephones.addPhone(phone1);
    	servicephones.printListPhonesByPrice();
    	servicephones.removePhoneByIndex(1);
    	servicephones.printListPhones();
   	
    	ServiceBasicUser serviceBasicUser = new ServiceBasicUser();
    	ServiceAdmin serviceAdmin = new ServiceAdmin();
    	Admin admin = new Admin("Gabi", "123456", "admin1@gmail.com");
    	serviceAdmin.createBasicUser(user2);
    	serviceAdmin.createBasicUser(user1);
    	System.out.println(serviceBasicUser.getBasicUsers());
		
		ServiceBasicUser serviceUsers = new ServiceBasicUser();
		BasicUser user11 = new BasicUser("Andrei", "pass1", "andrei@gmail.com");
		serviceUsers.addBasicUser(user11);
		serviceUsers.updateEmailByName("Andrei", "New@gmail.cmo");
		serviceUsers.printListBasicUsers();
		serviceUsers.removeBasicUserByName("Andrei");
		System.out.println("\\");
		serviceUsers.printListBasicUsers();
		
		Log.clearLog();
        Log.log("System startup");
        
		
		ServiceLaptops servicelaptops1 = new ServiceLaptops();
		ServiceSwitches serviceswitch = new ServiceSwitches();
		ServiceBasicUser serviceUsers1 = new ServiceBasicUser();
		ServicePhones servicephones1 = new ServicePhones();
		ServiceTVs serviceTV = new ServiceTVs();
		ServiceCourier serviceCourier = new ServiceCourier();
//		ReadCSV loader = ReadCSV.getInstance();
//   	    loader.loadClasses(servicelaptops1, serviceswitch, serviceUsers1, servicephones1);
//    	servicelaptops1.printListLaptops();
////    	servicelaptops1.removeLaptopByName("ASUS X615MA");
//    	WriteCSV writer = WriteCSV.getInstance();
//    	writer.writeToFiles(servicelaptops1, serviceswitch, serviceUsers1, servicephones1);
    	
    	Log.log("System shutdown");
        Log.getBw().close();
        
      //testing
        Log.clearLog();
        Log.log("System startup");

        DBConnection dbcon = DBConnection.getInstance();
        ReadDB rdb = ReadDB.getInstance();
        
        boolean flag = true;
        try {
            dbcon.startConn();

            rdb.loadObjects(serviceUsers1, serviceTV, serviceCourier, serviceAdmin);
        } catch (Exception e) {
            Log.log("Can't access database");
            flag = false;
        }
        
        if(flag) dbcon.closeConn();

        Log.log("System shutdown");
        Log.getBw().close();
		
    }
    
}
