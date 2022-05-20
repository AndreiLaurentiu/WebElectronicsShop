package models;

public class Connection {
	private String wireless;
	private String bluetooth;
	private String ports;
	
	public Connection(String wireless, String bluetooth, String ports) {
		super();
		this.wireless = wireless;
		this.bluetooth = bluetooth;
		this.ports = ports;
	}

	public String getWireless() {
		return wireless;
	}

	public void setWireless(String wireless) {
		this.wireless = wireless;
	}

	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String getPorts() {
		return ports;
	}

	public void setPorts(String ports) {
		this.ports = ports;
	}
	
	
	
}
