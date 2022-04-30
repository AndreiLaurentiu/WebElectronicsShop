package products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
    	
    	BasicUser user1 = new BasicUser(1, "Andrei", "pass1", "andrei@gmail.com");
    	BasicUser user2 = new BasicUser(2, "Laur", "pass2", "laur@gmail.com");
    	
    	Laptop laptop1 = new Laptop(1, "Asus", 2, "36.02 cm x 23.49 cm x 1.99 cm", "grey",1200, "Intel Celeron N4020",
    			"1.10GHz", "256GB", "4GB", "45% NTSC\r\n"
    					+ "Anti-Glare\r\n"
    					+ "LED\r\n"
    					+ "Luminozitate 200 Niti\r\n"
    					+ "Truelife", 15.6f, "802.11a/b/g/n/ac", "Bluetooth 4.1", "2 x USB 2.0, 1 x HDMI, "
    							+ "Microphone", "Difuzoare stereo\r\n"
    									+ "Tehnologie ASUS SonicMaster", "VGA", "2 celule\r\n"
    											+ "37 Whr\r\n"
    											+ "Lithium Ion", "None included", "6W", "4MB", "Intel UHD Graphics",
    											"Integrated", "Without Touchscreen", "1920 x 1080", "1 x Slot M2", 
    											"microSD", "yes", "no");
    	Phone phone1 = new Phone(1, "Apple", 0.143f, "138.3 x 67.1 x 7.1 mm", "black", 600, "A9 chip with 64-bit architecture", "-", 
    			"32GB", "2GB", "Touchscreen Capacitiv", 4.7f, "Wi Fi", "4.2, A2DP, LE", "Lightning connector 3.5 mm jack", "Speaker", "primary camera resolution 12", "Li-Po 1715 mAh battery (6.9 Wh), fixa", "iOS 9", "no", "no", "with 3G",
    					"with 4G", "yes", "802.11 a/b/g/n/ac, dual-band, hotspot", "-", "750 x 1334 pixels (~326 ppi pixel density)", "without card", "Accelerometer, gyro, proximity, compass, barometer");
    	
    	
    	
        List<ItUserDevices> itUserDevices = new LinkedList<>();
        List<Networking> networkingDevices = new LinkedList<>();
        List<TV> tvs = new LinkedList<>();
        LinkedList<BasicUser> basicUsers = new LinkedList<>();
        ArrayList<Admin> admins = new ArrayList<>();
        
        basicUsers.add(user2);
        basicUsers.add(user1);
        
        itUserDevices.add(laptop1);
        itUserDevices.add(phone1);
        
        
        // testing the sorting of the collections
        System.out.println(basicUsers);
        
        Collections.sort(basicUsers);
        
        System.out.println(basicUsers);
        
        Collections.sort((List<ItUserDevices>) itUserDevices);
        
        System.out.println(itUserDevices);
        
    }
    
}
