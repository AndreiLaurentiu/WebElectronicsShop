package products;

public class Phone extends ItUserDevices{
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

    public Phone(int idProduct, String brand, float weight, String dimensions, String colour, int price, String processorType, String processorFrequency,
                 String HDDCapacity, String RAMMemory, String displayType, float diagonal, String wireless, String bluetooth,
                 String ports, String audio, String camera, String battery, String operatingSystem, String dualSim, String network2g,
                 String network3g, String network4g, String gps, String wlan,
                 String nfc, String resolution, String memorySlot, String sensors) {
        super(idProduct, brand, weight, dimensions, colour, price, processorType, processorFrequency, HDDCapacity, RAMMemory, displayType, diagonal, 
        		wireless, bluetooth, ports, audio, camera, battery, operatingSystem);
        this.idPhone = idProduct;
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
	
}
