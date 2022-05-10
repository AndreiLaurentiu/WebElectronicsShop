package models;

public class WifiRouter extends Networking{
	private static int idWifiRouterIndex = 1;
    private int idWifiRouter;
    private String standard80211ac;
    private String connectors;
    private String usb;
    private String transferRate;
    private String transferSpeed;
    private String frequency;
    private String security;
    private String compatibility3g4g;
    private String antenna;
    private String gigabyte;
    private String wirelessFrequency;
    private String supportedProtocols;
    private String transmissionPower;
    private String simSupport;
    private String specialCharacteristics;
    private String others;


    public WifiRouter(String productName, String brand, float weight, String dimensions, String colour, int price, String ports, String standards,
                      String management, String powerSupply, String transferSpeed, String standard80211ac, String connectors,
                      String usb, String transferRate, String frequency, String security,
                      String compatibility3g4g, String others, String antenna, String gigabyte, String wirelessFrequency,
                      String supportedProtocols, String transmissionPower, String simSupport, String specialCharacteristics, String imageURL) {
        super(productName, brand, weight, dimensions, colour, price, ports, standards, management, powerSupply, transferSpeed, imageURL);
        this.idWifiRouter = idWifiRouterIndex;
        this.standard80211ac = standard80211ac;
        this.connectors = connectors;
        this.usb = usb;
        this.transferRate = transferRate;
        this.transferSpeed = transferSpeed;
        this.frequency = frequency;
        this.security = security;
        this.compatibility3g4g = compatibility3g4g;
        this.others = others;
        this.antenna = antenna;
        this.gigabyte = gigabyte;
        this.wirelessFrequency = wirelessFrequency;
        this.supportedProtocols = supportedProtocols;
        this.transmissionPower = transmissionPower;
        this.simSupport = simSupport;
        this.specialCharacteristics = specialCharacteristics;
        idWifiRouterIndex++;
    }
    
    @Override
    public String toString() {
        return "WifiRouter{" +
                "ports='" + getPorts() + '\'' +
                ", standards='" + getStandards() + '\'' +
                ", management='" + getManagement() + '\'' +
                ", powerSupply='" + getPowerSupply() + '\'' +
                ", transferSpeed='" + transferSpeed + '\'' +
                ", others='" + others + '\'' +
                ", standard80211ac='" + standard80211ac + '\'' +
                ", connectors='" + connectors + '\'' +
                ", usb='" + usb + '\'' +
                ", transferRate='" + transferRate + '\'' +
                ", transferSpeed='" + transferSpeed + '\'' +
                ", frequency='" + frequency + '\'' +
                ", security='" + security + '\'' +
                ", compatibility3g4g='" + compatibility3g4g + '\'' +
                ", antenna='" + antenna + '\'' +
                ", gigabyte='" + gigabyte + '\'' +
                ", wirelessFrequency='" + wirelessFrequency + '\'' +
                ", supportedProtocols='" + supportedProtocols + '\'' +
                ", transmissionPower='" + transmissionPower + '\'' +
                ", simSupport='" + simSupport + '\'' +
                ", specialCharacteristics='" + specialCharacteristics + '\'' +
                ", others='" + others + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", dimensions='" + getDimensions() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", price='" + getPrice() + '\'' +
                '}';
    }
}
