package csvs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import models.Laptop;
import services.ServiceLaptops;

public class ReadCSV {

	 private static final ReadCSV rw_csv = null;

	    private ReadCSV() {
	    }

	    public static ReadCSV getInstance() {
	        return rw_csv;
	    }
	    
	    private static void laptops(ServiceLaptops service) throws IOException {
	    	File file = new File("src/main/java/csvs/laptops.csv");
	        FileReader fr = new FileReader(file);
	        BufferedReader br = new BufferedReader(fr);
	    	String line = null;
	    	String[] tempArray = null;
	    	line = br.readLine();
	    	line = null;
	        while((line = br.readLine()) != null) {
	        	tempArray = line.split(",");
	        	service.addLaptop(new Laptop(tempArray[0], tempArray[1], Float.parseFloat(tempArray[2].trim()), tempArray[3], tempArray[4], Integer.parseInt(tempArray[5].trim()), 
	        			tempArray[6], tempArray[7], tempArray[8], tempArray[9], tempArray[10], Float.parseFloat(tempArray[11]), tempArray[12], tempArray[13],
	        			tempArray[14], tempArray[15], tempArray[16], tempArray[17], tempArray[18], tempArray[19], tempArray[20], 
	        			tempArray[21], tempArray[22], tempArray[23], tempArray[24], tempArray[25], tempArray[26], tempArray[27], tempArray[28],
	        			tempArray[29]));
	      
	        }
	        br.close();
	    }
	    
	    public static void loadClasses(ServiceLaptops servicelapt) {
	    	try {
				laptops(servicelapt);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	    }
	    
}
