package models;

public class Phone extends ItUserDevices{
	private static int idPhoneIndex = 1;
	private int idPhone;
    private String dualSim;
    private String network2g;
    private String network3g;
    private String network4g;
    private String gps;
    private String wlan;
    private String nfc;
    private String resolution;
    private String memorySlot;
    private String sensors;

    public Phone(String productName, String brand, float weight, String dimensions, String colour, int price, String processorType, String processorFrequency,
                 String HDDCapacity, String RAMMemory, String displayType, float diagonal, String wireless, String bluetooth,
                 String ports, String audio, String camera, String battery, String operatingSystem, String dualSim, String network2g,
                 String network3g, String network4g, String gps, String wlan,
                 String nfc, String resolution, String memorySlot, String sensors, String imageURL) {
        super(productName, brand, weight, dimensions, colour, price, processorType, processorFrequency, HDDCapacity, RAMMemory, displayType, diagonal, 
        		wireless, bluetooth, ports, audio, camera, battery, operatingSystem, imageURL);
        this.idPhone = idPhoneIndex;
        this.dualSim = dualSim;
        this.network2g = network2g;
        this.network3g = network3g;
        this.network4g = network4g;
        this.gps = gps;
        this.wlan = wlan;
        this.nfc = nfc;
        this.resolution = resolution;
        this.memorySlot = memorySlot;
        this.sensors = sensors;
        idPhoneIndex++;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "processorType='" + getProcessorType() + '\'' +
                ", processorFrequency='" + getProcessorFrequency() + '\'' +
                ", HDDCapacity='" + getHDDCapacity() + '\'' +
                ", RAMMemory='" + getRAMMemory() + '\'' +
                ", DisplayType='" + getDisplayType() + '\'' +
                ", diagonal=" + getDiagonal() +
                ", wireless='" + getWireless() + '\'' +
                ", bluetooth='" + getBluetooth() + '\'' +
                ", ports='" + getPorts() + '\'' +
                ", audio='" + getAudio() + '\'' +
                ", camera='" + getCamera() + '\'' +
                ", battery='" + getBattery() + '\'' +
                ", operatingSystem='" + getOperatingSystem() + '\'' +
                ", others='" + getOthers() + '\'' +
                ", idPhone=" + idPhone +
                ", dualSim='" + dualSim + '\'' +
                ", network2g='" + network2g + '\'' +
                ", network3g='" + network3g + '\'' +
                ", network4g='" + network4g + '\'' +
                ", gps='" + gps + '\'' +
                ", wlan='" + wlan + '\'' +
                ", nfc='" + nfc + '\'' +
                ", resolution='" + resolution + '\'' +
                ", memorySlot='" + memorySlot + '\'' +
                ", sensors='" + sensors + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", dimensions='" + getDimensions() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", price='" + getPrice() + '\'' +
                '}';
    }

	public int getIdPhone() {
		return idPhone;
	}

	public void setIdPhone(int idPhone) {
		this.idPhone = idPhone;
	}

	public String getDualSim() {
		return dualSim;
	}

	public void setDualSim(String dualSim) {
		this.dualSim = dualSim;
	}

	public String getNetwork2g() {
		return network2g;
	}

	public void setNetwork2g(String network2g) {
		this.network2g = network2g;
	}

	public String getNetwork3g() {
		return network3g;
	}

	public void setNetwork3g(String network3g) {
		this.network3g = network3g;
	}

	public String getNetwork4g() {
		return network4g;
	}

	public void setNetwork4g(String network4g) {
		this.network4g = network4g;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public String getWlan() {
		return wlan;
	}

	public void setWlan(String wlan) {
		this.wlan = wlan;
	}

	public String getNfc() {
		return nfc;
	}

	public void setNfc(String nfc) {
		this.nfc = nfc;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getMemorySlot() {
		return memorySlot;
	}

	public void setMemorySlot(String memorySlot) {
		this.memorySlot = memorySlot;
	}

	public String getSensors() {
		return sensors;
	}

	public void setSensors(String sensors) {
		this.sensors = sensors;
	}
	
    
}
