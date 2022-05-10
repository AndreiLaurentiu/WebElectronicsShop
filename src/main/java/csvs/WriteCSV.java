package csvs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import models.Laptop;
import services.ServiceLaptops;

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
    
    public static void writeToFiles(ServiceLaptops servicelapt) {
    	try {
    		Log.log("Uploading laptops");
			laptops(servicelapt);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }

}
