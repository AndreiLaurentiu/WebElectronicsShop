package models;

public abstract class ItUserDevices extends Product {
	private static int idIUDIndex = 1;
	private int idIUD;
    private String processorType;
    private String processorFrequency;
    private String hddCapacity;
    private String ramMemory;
    private String displayType;
    private float diagonal;
    private String audio;
    private String camera;
    private String battery;
    private String operatingSystem;
    private String others;
    private Connection connection;

    public ItUserDevices(String productName, String brand, float weight, String dimensions, String colour, int price, String processorType,
                         String processorFrequency, String hddCapacity, String ramMemory, String displayType,
                         float diagonal, String wireless, String bluetooth, String ports,
                         String audio, String camera, String battery, String operatingSystem, String imageURL) {
        super(productName, brand, weight, dimensions, colour, price, imageURL);
        this.idIUD = idIUDIndex;
        this.processorType = processorType;
        this.processorFrequency = processorFrequency;
        this.hddCapacity = hddCapacity;
        this.ramMemory = ramMemory;
        this.displayType = displayType;
        this.diagonal = diagonal;
        this.audio = audio;
        this.camera = camera;
        this.battery = battery;
        this.operatingSystem = operatingSystem;
        this.connection = new Connection(wireless, bluetooth, ports);
        idIUDIndex++;
    }
    
    public String getRAMMemory() {
    	return this.ramMemory;
    }
    
    public String getProcessorType() {
        return processorType;
    }

    public String getProcessorFrequency() {
        return processorFrequency;
    }

    public String getHDDCapacity() {
        return hddCapacity;
    }

    public String getDisplayType() {
        return displayType;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public String getWireless() {
        return connection.getWireless();
    }

    public String getBluetooth() {
        return connection.getBluetooth();
    }

    public String getPorts() {
        return connection.getPorts();
    }

    public String getAudio() {
        return audio;
    }

    public String getCamera() {
        return camera;
    }

    public String getBattery() {
        return battery;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getOthers() {
        return others;
    }
  
}
