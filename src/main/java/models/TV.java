package models;

public class TV extends Product{
	private static int idTVIndex = 1;
    private int idTV;
    private String diagonal;
    private String displayType;
    private String resolution;
    private String screenResolution;
    private String curbed;
    private String imageCharacteristics;
    private String soundCharacteristics;
    private String integratedSpeaker;
    private String connector;
    private String hdmiInputs;
    private String bluetooth;
    private String usbInput;
    private String ciSlot;
    private String smartTVFunctions;
    private String powerConsumption;
    private String includedAccessories;
    private String others;
    private String tuner;

    public TV(String productName, String brand,  float weight, String dimensions, String colour, int price,
              String diagonal, String displayType, String resolution, String screenResolution,
              String curbed, String imageCharacteristics, String soundCharacteristics, String integratedSpeaker,
              String connector, String hdmiInputs, String bluetooth, String usbInput, String ciSlot,
              String smartTVFunctions, String powerConsumption,
              String includedAccessories, String others, String tuner, String imageURL) {
        super(productName, brand, weight, dimensions, colour, price, imageURL);
        this.idTV = idTVIndex;
        this.diagonal = diagonal;
        this.displayType = displayType;
        this.resolution = resolution;
        this.screenResolution = screenResolution;
        this.curbed = curbed;
        this.imageCharacteristics = imageCharacteristics;
        this.soundCharacteristics = soundCharacteristics;
        this.integratedSpeaker = integratedSpeaker;
        this.connector = connector;
        this.hdmiInputs = hdmiInputs;
        this.bluetooth = bluetooth;
        this.usbInput = usbInput;
        this.ciSlot = ciSlot;
        this.smartTVFunctions = smartTVFunctions;
        this.powerConsumption = powerConsumption;
        this.includedAccessories = includedAccessories;
        this.others = others;
        this.tuner = tuner;
        idTVIndex++;
    }
   
    
    @Override
    public String toString() {
        return "TV{" +
                "diagonal='" + diagonal + '\'' +
                ", displayType='" + displayType + '\'' +
                ", resolution='" + resolution + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", curbed='" + curbed + '\'' +
                ", imageCharacteristics='" + imageCharacteristics + '\'' +
                ", soundCharacteristics='" + soundCharacteristics + '\'' +
                ", integratedSpeaker='" + integratedSpeaker + '\'' +
                ", connector='" + connector + '\'' +
                ", hdmiInputs='" + hdmiInputs + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                ", usbInput='" + usbInput + '\'' +
                ", ciSlot='" + ciSlot + '\'' +
                ", smartTVFunctions='" + smartTVFunctions + '\'' +
                ", powerConsumption='" + powerConsumption + '\'' +
                ", includedAccessories='" + includedAccessories + '\'' +
                ", others='" + others + '\'' +
                ", tuner='" + tuner + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", dimensions='" + getDimensions() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", price='" + getPrice() + '\'' +
                '}';
    }


	public int getIdTV() {
		return idTV;
	}


	public void setIdTV(int idTV) {
		this.idTV = idTV;
	}


	public String getDiagonal() {
		return diagonal;
	}


	public void setDiagonal(String diagonal) {
		this.diagonal = diagonal;
	}


	public String getDisplayType() {
		return displayType;
	}


	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}


	public String getResolution() {
		return resolution;
	}


	public void setResolution(String resolution) {
		this.resolution = resolution;
	}


	public String getScreenResolution() {
		return screenResolution;
	}


	public void setScreenResolution(String screenResolution) {
		this.screenResolution = screenResolution;
	}


	public String getCurbed() {
		return curbed;
	}


	public void setCurbed(String curbed) {
		this.curbed = curbed;
	}


	public String getImageCharacteristics() {
		return imageCharacteristics;
	}


	public void setImageCharacteristics(String imageCharacteristics) {
		this.imageCharacteristics = imageCharacteristics;
	}


	public String getSoundCharacteristics() {
		return soundCharacteristics;
	}


	public void setSoundCharacteristics(String soundCharacteristics) {
		this.soundCharacteristics = soundCharacteristics;
	}


	public String getIntegratedSpeaker() {
		return integratedSpeaker;
	}


	public void setIntegratedSpeaker(String integratedSpeaker) {
		this.integratedSpeaker = integratedSpeaker;
	}


	public String getConnector() {
		return connector;
	}


	public void setConnector(String connector) {
		this.connector = connector;
	}


	public String getHdmiInputs() {
		return hdmiInputs;
	}


	public void setHdmiInputs(String hdmiInputs) {
		this.hdmiInputs = hdmiInputs;
	}


	public String getBluetooth() {
		return bluetooth;
	}


	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}


	public String getUsbInput() {
		return usbInput;
	}


	public void setUsbInput(String usbInput) {
		this.usbInput = usbInput;
	}


	public String getCiSlot() {
		return ciSlot;
	}


	public void setCiSlot(String ciSlot) {
		this.ciSlot = ciSlot;
	}


	public String getSmartTVFunctions() {
		return smartTVFunctions;
	}


	public void setSmartTVFunctions(String smartTVFunctions) {
		this.smartTVFunctions = smartTVFunctions;
	}


	public String getPowerConsumption() {
		return powerConsumption;
	}


	public void setPowerConsumption(String powerConsumption) {
		this.powerConsumption = powerConsumption;
	}


	public String getIncludedAccessories() {
		return includedAccessories;
	}


	public void setIncludedAccessories(String includedAccessories) {
		this.includedAccessories = includedAccessories;
	}


	public String getOthers() {
		return others;
	}


	public void setOthers(String others) {
		this.others = others;
	}


	public String getTuner() {
		return tuner;
	}


	public void setTuner(String tuner) {
		this.tuner = tuner;
	}
    
    
}
