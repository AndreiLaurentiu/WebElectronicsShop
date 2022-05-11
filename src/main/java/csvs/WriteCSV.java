package csvs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.TreeSet;

import models.BasicUser;
import models.Laptop;
import models.Phone;
import models.Switch;
import services.ServiceBasicUser;
import services.ServiceLaptops;
import services.ServicePhones;
import services.ServiceSwitches;
import services.ServiceTVs;

public class WriteCSV {
	private static final WriteCSV wr_csv = null;

    private WriteCSV() {
    }

    public static WriteCSV getInstance() {
        return wr_csv;
    }
    
    //TODO: add methods for all necessary models
    
    private static void laptops(ServiceLaptops service) throws IOException {
    	try (PrintWriter writer = new PrintWriter("src/main/java/csvs/laptops.csv")) {
			List<Laptop> list = service.getArrayOfLaptops();
			String header = "productName,	brand,	weight,	dimensions,	colour,	price,	processorType,	processorFrequency,	HDDCapacity,	RAMMemory,	displayType,	diagonal,	wireless,	bluetooth,	ports,	audio,	camera,	baterry,	operatingSystem	powerConsumed,	cacheMemory	chipsetVideo,	videoRamMemory,	touchscreen,	optimalResolution,	slots,	cardReader,	numericalKeyboard,	illuminatedKeyboard,	imageURL";
			writer.println(header);
			
			for (Laptop laptop : list) {
			    writer.println(laptop.getProductName() + ", " + laptop.getBrand() + ", " + laptop.getWeight() + ", " + laptop.getDimensions() + ", " + laptop.getColour() + ", " +
			    		laptop.getPrice() + ", " +  laptop.getProcessorType() + ", " + laptop.getProcessorFrequency() + ", " + laptop.getHDDCapacity() + ", " + laptop.getRAMMemory() + ", " +
			    		laptop.getDisplayType() + ", " + laptop.getDiagonal() + ", " + laptop.getWireless() + ", " + laptop.getBluetooth() + ", " + laptop.getPorts() + ", " + laptop.getAudio() + ", " + 
			    		laptop.getCamera() +", " + laptop.getBattery() +", "+ laptop.getOperatingSystem() +", " + laptop.getPowerConsumed() + ", "+ laptop.getCacheMemory()
			    		+ ", " + laptop.getChipsetVideo() + ", " + laptop.getVideoRamMemory() + ", " + laptop.getTouchscreen() + ", " + laptop.getOptimalResolution() + ", " + laptop.getSlots() + ", " +
			    		laptop.getCardReader() + ", " + laptop.getNumericalKeyboard() + ", " + laptop.getIlluminatedKeyboard() + ", " + laptop.getImage() );
			}
		}
        
    }
    
    private static void switches(ServiceSwitches service) throws IOException {
    	try (PrintWriter writer = new PrintWriter("src/main/java/csvs/switches.csv")) {
			List<Switch> list = service.getSwitches();
			String header = "productName, brand, weight, dimensions, colour, price, ports, standards, management, powerSupply, transferSpeed, connectivity, poe, ledIndicators, rackMountable, macTable, imageURL";
			writer.println(header);
			
			for (Switch Switch : list) {
			    writer.println(Switch.getProductName() + ", " + Switch.getBrand() + ", " + Switch.getWeight() + ", " + Switch.getDimensions() + ", " + Switch.getColour() + ", " +
			    		Switch.getPrice() + ", " +  Switch.getPorts() + ", " + Switch.getStandards() + ", " + Switch.getManagement() + ", " + Switch.getPowerSupply() + ", " +
			    		Switch.getTransferSpeed() + ", " + Switch.getConnectivity() + ", " + Switch.getPoe() + ", " + Switch.getLedIndicators() + ", " + Switch.getRackMountable() + ", " + Switch.getMacTable() + ", " + 
			    		Switch.getImage());
			}
		}
        
    }
    
    private static void basicUsers(ServiceBasicUser service) throws IOException {
    	try (PrintWriter writer = new PrintWriter("src/main/java/csvs/basicUsers.csv")) {
			TreeSet<BasicUser> list = service.getBasicUsers();
			String header = "Username, Password, Email";
			writer.println(header);
			
			for (BasicUser laptop : list) {
			    writer.println(laptop.getUsername() + ", " + laptop.getPassword() + ", " + laptop.getEmail());
			}
		}
        
    }
    
    private static void phones(ServicePhones service) throws IOException {
    	try (PrintWriter writer = new PrintWriter("src/main/java/csvs/phones.csv")) {
			List<Phone> list = service.getPhones();
			String header = "productName, brand, weight, dimensions, colour, price, processorType, processorFrequency, HDDCapacity, RAMMemory, displayType, diagonal, wireless, bluetooth, ports, audio, camera, battery, operatingSystem, dualSim, network2g, network3g, network4g, gps, wlan, nfc, resolution, memorySlot, sensors, imageURL";
			writer.println(header);
			
			for (Phone Phone : list) {
			    writer.println(Phone.getProductName() + ", " + Phone.getBrand() + ", " + Phone.getWeight() + ", " + Phone.getDimensions() + ", " + Phone.getColour() + ", " +
			    		Phone.getPrice() + ", " +  Phone.getProcessorType() + Phone.getProcessorFrequency() + ", "+ Phone.getHDDCapacity() + ", "+ Phone.getRAMMemory() + ", "+ Phone.getDisplayType() + ", "+ Phone.getDiagonal() + ", "+ Phone.getWireless() + ", "+ Phone.getBluetooth() + ", "+ Phone.getPorts() + ", "+ Phone.getAudio() + ", "+ Phone.getCamera() + ", "+ Phone.getBattery() + ", "+
			    		Phone.getOperatingSystem() + ", "+ Phone.getDualSim() + ", "+ Phone.getNetwork2g() + ", "+ Phone.getNetwork3g() + ", "+ Phone.getNetwork4g() + ", "+ Phone.getGps() + ", "+ Phone.getWlan() + ", "+ Phone.getNfc() + ", "+ Phone.getResolution() + ", "+ Phone.getMemorySlot() + ", "+ Phone.getSensors() + ", "+ Phone.getImage());
			}
		}
        
    }
    
    
    public static void writeToFiles(ServiceLaptops servicelapt, ServiceSwitches serviceSwitch, ServiceBasicUser serviceBasicUser, ServicePhones servicePhone) {
    	try {
    		Log.log("Uploading laptops");
			laptops(servicelapt);
			Log.log("Uploading switches");
			switches(serviceSwitch);
			Log.log("Uploading basci users");
			basicUsers(serviceBasicUser);
			Log.log("Uploading phones");
			phones(servicePhone);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }

}
