package products;

public class Switch extends Networking{
	private static int idSwitchIndex = 1;
    private int idSwitch;
    String connectivity;
    String poe;
    String ledIndicators;
    String rackMountable;
    String macTable;

    public Switch(String productName, String brand, int weight, String dimensions, String colour, int price, String ports,
                  String standards, String management, String powerSupply, String transferSpeed,
                  String connectivity, String poe, String ledIndicators, String rackMountable, String macTable) {
        super(productName, brand, weight, dimensions, colour, price, ports, standards, management, powerSupply, transferSpeed);
        this.idSwitch = idSwitchIndex;
        this.connectivity = connectivity;
        this.poe = poe;
        this.ledIndicators = ledIndicators;
        this.rackMountable = rackMountable;
        this.macTable = macTable;
        idSwitchIndex++;
    }
    
    @Override
    public String toString() {
        return "Switch{" +
                "ports='" + getPorts() + '\'' +
                ", standards='" + getStandards() + '\'' +
                ", management='" + getManagement() + '\'' +
                ", powerSupply='" + getPowerSupply() + '\'' +
                ", transferSpeed='" + getTransferSpeed() + '\'' +
                ", others='" + getOthers() + '\'' +
                ", connectivity='" + connectivity + '\'' +
                ", poe='" + poe + '\'' +
                ", ledIndicators='" + ledIndicators + '\'' +
                ", rackMountable='" + rackMountable + '\'' +
                ", macTable='" + macTable + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", dimensions='" + getDimensions() + '\'' +
                ", colour='" + getColour() + '\'' +
                ", price='" + getPrice() + '\'' +
                '}';
    }
    
}
