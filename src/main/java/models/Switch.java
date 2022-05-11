package models;

public class Switch extends Networking{
	private static int idSwitchIndex = 1;
    private int idSwitch;
    String connectivity;
    String poe;
    String ledIndicators;
    String rackMountable;
    String macTable;

    public Switch(String productName, String brand, float weight, String dimensions, String colour, int price, String ports,
                  String standards, String management, String powerSupply, String transferSpeed,
                  String connectivity, String poe, String ledIndicators, String rackMountable, String macTable, String imageURL) {
        super(productName, brand, weight, dimensions, colour, price, ports, standards, management, powerSupply, transferSpeed, imageURL);
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

	public int getIdSwitch() {
		return idSwitch;
	}

	public void setIdSwitch(int idSwitch) {
		this.idSwitch = idSwitch;
	}

	public String getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	public String getPoe() {
		return poe;
	}

	public void setPoe(String poe) {
		this.poe = poe;
	}

	public String getLedIndicators() {
		return ledIndicators;
	}

	public void setLedIndicators(String ledIndicators) {
		this.ledIndicators = ledIndicators;
	}

	public String getRackMountable() {
		return rackMountable;
	}

	public void setRackMountable(String rackMountable) {
		this.rackMountable = rackMountable;
	}

	public String getMacTable() {
		return macTable;
	}

	public void setMacTable(String macTable) {
		this.macTable = macTable;
	}
    
    
    
}
