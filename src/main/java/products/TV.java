package products;

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

    public TV(String productName, String brand, int weight, String dimensions, String colour, int price,
              String diagonal, String displayType, String resolution, String screenResolution,
              String curbed, String imageCharacteristics, String soundCharacteristics, String integratedSpeaker,
              String connector, String hdmiInputs, String bluetooth, String usbInput, String ciSlot,
              String smartTVFunctions, String powerConsumption,
              String includedAccessories, String others, String tuner) {
        super(productName, brand, weight, dimensions, colour, price);
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
}
