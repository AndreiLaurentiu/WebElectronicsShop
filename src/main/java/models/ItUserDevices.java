package models;

public abstract class ItUserDevices extends Product {
	private static int idIUDIndex = 1;
	private int idIUD;
    private String processorType;
    private String processorFrequency;
    private String HDDCapacity;
    private String RAMMemory;
    private String DisplayType;
    private float diagonal;
    private String wireless;
    private String bluetooth;
    private String ports;
    private String audio;
    private String camera;
    private String battery;
    private String operatingSystem;
    private String others;

    public ItUserDevices(String productName, String brand, float weight, String dimensions, String colour, int price, String processorType,
                         String processorFrequency, String HDDCapacity, String RAMMemory, String displayType,
                         float diagonal, String wireless, String bluetooth, String ports,
                         String audio, String camera, String battery, String operatingSystem, String imageURL) {
        super(productName, brand, weight, dimensions, colour, price, imageURL);
        this.idIUD = idIUDIndex;
        this.processorType = processorType;
        this.processorFrequency = processorFrequency;
        this.HDDCapacity = HDDCapacity;
        this.RAMMemory = RAMMemory;
        DisplayType = displayType;
        this.diagonal = diagonal;
        this.wireless = wireless;
        this.bluetooth = bluetooth;
        this.ports = ports;
        this.audio = audio;
        this.camera = camera;
        this.battery = battery;
        this.operatingSystem = operatingSystem;
        idIUDIndex++;
    }
    
    public String getRAMMemory() {
    	return this.RAMMemory;
    }
    
    public String getProcessorType() {
        return processorType;
    }

    public String getProcessorFrequency() {
        return processorFrequency;
    }

    public String getHDDCapacity() {
        return HDDCapacity;
    }

    public String getDisplayType() {
        return DisplayType;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public String getWireless() {
        return wireless;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public String getPorts() {
        return ports;
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
