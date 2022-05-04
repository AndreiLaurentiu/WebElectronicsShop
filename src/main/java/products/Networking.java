package products;

public abstract class Networking extends Product{
	private static int idNetworkingIndex = 1;
	private int idNetworking;
    private String ports;
    private String standards;
    private String management;
    private String powerSupply;
    private String transferSpeed;
    private String others;

    public Networking(String nameProduct, String brand, int weight, String dimensions, String colour,int price, 
                      String ports, String standards, String management, String powerSupply, String transferSpeed, String imageURL) {
        super(nameProduct, brand, weight, dimensions, colour, price, imageURL);
        this.idNetworking = idNetworkingIndex;
        this.ports = ports;
        this.standards = standards;
        this.management = management;
        this.powerSupply = powerSupply;
        this.transferSpeed = transferSpeed;
        idNetworkingIndex++;
    }
    public String getPorts() {
        return ports;
    }

    public String getStandards() {
        return standards;
    }

    public String getManagement() {
        return management;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getTransferSpeed() {
        return transferSpeed;
    }

    public String getOthers() {
        return others;
    }
}
