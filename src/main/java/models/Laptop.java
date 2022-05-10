package models;

public class Laptop extends ItUserDevices{
	private static int idLaptopIndex = 1;
	private int idLaptop;
    private String powerConsumed;
    private String cacheMemory;
    private String chipsetVideo;
    private String videoRamMemory;
    private String touchscreen;
    private String optimalResolution;
    private String slots;
    private String cardReader;
    private String numericalKeyboard;
    private String illuminatedKeyboard;

    public static int getIdLaptopIndex() {
		return idLaptopIndex;
	}

	public static void setIdLaptopIndex(int idLaptopIndex) {
		Laptop.idLaptopIndex = idLaptopIndex;
	}

	public int getIdLaptop() {
		return idLaptop;
	}

	public void setIdLaptop(int idLaptop) {
		this.idLaptop = idLaptop;
	}

	public String getPowerConsumed() {
		return powerConsumed;
	}

	public void setPowerConsumed(String powerConsumed) {
		this.powerConsumed = powerConsumed;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}

	public void setCacheMemory(String cacheMemory) {
		this.cacheMemory = cacheMemory;
	}

	public String getChipsetVideo() {
		return chipsetVideo;
	}

	public void setChipsetVideo(String chipsetVideo) {
		this.chipsetVideo = chipsetVideo;
	}

	public String getVideoRamMemory() {
		return videoRamMemory;
	}

	public void setVideoRamMemory(String videoRamMemory) {
		this.videoRamMemory = videoRamMemory;
	}

	public String getTouchscreen() {
		return touchscreen;
	}

	public void setTouchscreen(String touchscreen) {
		this.touchscreen = touchscreen;
	}

	public String getOptimalResolution() {
		return optimalResolution;
	}

	public void setOptimalResolution(String optimalResolution) {
		this.optimalResolution = optimalResolution;
	}

	public String getSlots() {
		return slots;
	}

	public void setSlots(String slots) {
		this.slots = slots;
	}

	public String getCardReader() {
		return cardReader;
	}

	public void setCardReader(String cardReader) {
		this.cardReader = cardReader;
	}

	public String getNumericalKeyboard() {
		return numericalKeyboard;
	}

	public void setNumericalKeyboard(String numericalKeyboard) {
		this.numericalKeyboard = numericalKeyboard;
	}

	public String getIlluminatedKeyboard() {
		return illuminatedKeyboard;
	}

	public void setIlluminatedKeyboard(String illuminatedKeyboard) {
		this.illuminatedKeyboard = illuminatedKeyboard;
	}

	public Laptop(String productName, String brand, float weight, String dimensions, String colour, int price, String processorType,
                  String processorFrequency, String HDDCapacity, String RAMMemory, String displayType,
                  float diagonal, String wireless, String bluetooth, String ports, String audio,
                  String camera, String battery, String operatingSystem, String powerConsumed, String cacheMemory,
                  String chipsetVideo, String videoRamMemory, String touchscreen,
                  String optimalResolution, String slots, String cardReader, String numericalKeyboard,
                  String illuminatedKeyboard, String imageURL) {
        super(productName, brand, weight, dimensions, colour, price, processorType, processorFrequency, HDDCapacity, RAMMemory, displayType, diagonal, wireless, 
        		bluetooth, ports, audio, camera, battery, operatingSystem, imageURL);
        this.idLaptop = idLaptopIndex;
        this.powerConsumed = powerConsumed;
        this.cacheMemory = cacheMemory;
        this.chipsetVideo = chipsetVideo;
        this.videoRamMemory = videoRamMemory;
        this.touchscreen = touchscreen;
        this.optimalResolution = optimalResolution;
        this.slots = slots;
        this.cardReader = cardReader;
        this.numericalKeyboard = numericalKeyboard;
        this.illuminatedKeyboard = illuminatedKeyboard;
        idLaptopIndex++;
    }
    
    @Override
    public String toString() {
        return "Laptop{" +
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
                ", powerConsumed='" + powerConsumed + '\'' +
                ", cacheMemory='" + cacheMemory + '\'' +
                ", chipsetVideo='" + chipsetVideo + '\'' +
                ", videoRamMemory='" + videoRamMemory + '\'' +
                ", touchscreen='" + touchscreen + '\'' +
                ", optimalResolution='" + optimalResolution + '\'' +
                ", slots='" + slots + '\'' +
                ", cardReader='" + cardReader + '\'' +
                ", numericalKeyboard='" + numericalKeyboard + '\'' +
                ", illuminatedKeyboard='" + illuminatedKeyboard + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", dimensions='" + getDimensions() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", price='" + getPrice() + '\'' + ",imageURL='" + getImage() +
                '}';
    }
}
