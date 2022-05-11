package csvs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import models.BasicUser;
import models.Laptop;
import models.Phone;
import models.Switch;
import models.TV;
import services.ServiceBasicUser;
import services.ServiceLaptops;
import services.ServicePhones;
import services.ServiceSwitches;
import services.ServiceTVs;

public class ReadCSV {

	 private static final ReadCSV rw_csv = null;

	    private ReadCSV() {
	    }

	    public static ReadCSV getInstance() {
	        return rw_csv;
	    }
	    
	    //TODO: add methods for all necessary models
	    
	    private static void laptops(ServiceLaptops service) throws IOException {
	    	File file = new File("src/main/java/csvs/laptops.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr,10 *1024);
            String line = null;
            String[] tempArray = null;
            line = br.readLine();
            line = null;
            while((line = br.readLine()) != null) {
                tempArray = line.split(",");
                service.addLaptop(new Laptop(tempArray[0], tempArray[1], Float.parseFloat(tempArray[2].trim()), tempArray[3], tempArray[4], Integer.parseInt(tempArray[5].trim()), 
                        tempArray[6], tempArray[7], tempArray[8], tempArray[9], tempArray[10], Float.parseFloat(tempArray[11].trim()), tempArray[12], tempArray[13],
                        tempArray[14], tempArray[15], tempArray[16], tempArray[17], tempArray[18], tempArray[19], tempArray[20], 
                        tempArray[21], tempArray[22], tempArray[23], tempArray[24], tempArray[25], tempArray[26], tempArray[27], tempArray[28],
                        tempArray[29]));

            }
            br.close();
        }
	    
	    private static void switches(ServiceSwitches service) throws IOException {
            File file = new File("src/main/java/csvs/switches.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr,10 *1024);
            String line = null;
            String[] tempArray = null;
            line = br.readLine();
            line = null;
            while((line = br.readLine()) != null) {
                tempArray = line.split(",");
                service.addSwitch(new Switch(tempArray[0], tempArray[1], Float.parseFloat(tempArray[2].trim()), tempArray[3], tempArray[4], Integer.parseInt(tempArray[5].trim()), 
                        tempArray[6], tempArray[7], tempArray[8], tempArray[9], tempArray[10], tempArray[11], tempArray[12], tempArray[13],
                        tempArray[14], tempArray[15], tempArray[16]));

            }
            br.close();
        }
	    
	    private static void basicUsers(ServiceBasicUser service) throws IOException {
            File file = new File("src/main/java/csvs/basicUsers.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr,10 *1024);
            String line = null;
            String[] tempArray = null;
            line = br.readLine();
            line = null;
            while((line = br.readLine()) != null) {
                tempArray = line.split(",");
                service.addBasicUser(new BasicUser(tempArray[0], tempArray[1], tempArray[2]));

            }
            br.close();
        }
	    
	    private static void phone(ServicePhones service) throws IOException {
            File file = new File("src/main/java/csvs/phones.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr,10 *1024);
            String line = null;
            String[] tempArray = null;
            line = br.readLine();
            line = null;
            while((line = br.readLine()) != null) {
                tempArray = line.split(",");
                service.addPhone(new Phone(tempArray[0], tempArray[1], Float.parseFloat(tempArray[2].trim()), tempArray[3], tempArray[4], Integer.parseInt(tempArray[5].trim()), 
                        tempArray[6], tempArray[7], tempArray[8], tempArray[9], tempArray[10], Float.parseFloat(tempArray[11].trim()), tempArray[12], tempArray[13],
                        tempArray[14], tempArray[15], tempArray[16], tempArray[17], tempArray[18], tempArray[19], tempArray[20], 
                        tempArray[21], tempArray[22], tempArray[23], tempArray[24], tempArray[25], tempArray[26], tempArray[27], tempArray[28],
                        tempArray[29]));

            }
            br.close();
        }

//	    private static void tv(ServiceTVs service) throws IOException {
//            File file = new File("src/main/java/csvs/TVs.csv");
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr,10 *1024);
//            String line = null;
//            String[] tempArray = null;
//            line = br.readLine();
//            line = null;
//            while((line = br.readLine()) != null) {
//                tempArray = line.split(",");
//                service.addTV(new TV(tempArray[0], tempArray[1], Float.parseFloat(tempArray[2].trim()), tempArray[3], tempArray[4], Integer.parseInt(tempArray[5].trim()), 
//                        tempArray[6], tempArray[7], tempArray[8], tempArray[9], tempArray[10], tempArray[11], tempArray[12], tempArray[13],
//                        tempArray[14], tempArray[15], tempArray[16], tempArray[17], tempArray[18], tempArray[19], tempArray[20], 
//                        tempArray[21], tempArray[22], tempArray[23], tempArray[24]));
//
//            }
//            br.close();
//        }
	    
	    
        public static void loadClasses(ServiceLaptops serviceLapt, ServiceSwitches serviceSwitch, ServiceBasicUser serviceBasicUser, ServicePhones servicePhone) {
            try {
            	Log.log("Loading laptops");
                laptops(serviceLapt);
                Log.log("Loading switches");
                switches(serviceSwitch);
                Log.log("Loading basic users");
                basicUsers(serviceBasicUser);
                Log.log("Loading phones");
                phone(servicePhone);
//                Log.log("Loading tvs");
//                tv(serviceTV);
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
	    
}
