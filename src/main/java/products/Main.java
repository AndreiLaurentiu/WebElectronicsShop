package products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import services.ServiceLaptops;
import services.ServicePhones;

public class Main {
	public static void main(String[] args) {
    	
    	BasicUser user1 = new BasicUser(1, "Andrei", "pass1", "andrei@gmail.com");
    	BasicUser user2 = new BasicUser(2, "Laur", "pass2", "laur@gmail.com");
    	
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
    	
    	HashSet<BasicUser> basicUsers = new HashSet<>();
    	Admin admin = new Admin(1, "Gabi", "123456", "admin1@gmail.com");
    	basicUsers.add(user2);
    	basicUsers.add(user1);
    	admin.deleteUserByName("Laur", basicUsers);
    	basicUsers.add(admin.createBasicUser());
    	System.out.println(basicUsers);
    	
    	
    }
    
}
