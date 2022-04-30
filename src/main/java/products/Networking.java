package products;

public abstract class Networking extends Product{
    private String ports;
    private String standards;
    private String management;
    private String powerSupply;
    private String transferSpeed;
    private String others;

    public Networking(int idProduct, String brand, int weight, String dimensions, String colour,int price, 
                      String ports, String standards, String management, String powerSupply, String transferSpeed) {
        super(idProduct, brand, weight, dimensions, colour, price);
        this.ports = ports;
        this.standards = standards;
        this.management = management;
        this.powerSupply = powerSupply;
        this.transferSpeed = transferSpeed;
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
