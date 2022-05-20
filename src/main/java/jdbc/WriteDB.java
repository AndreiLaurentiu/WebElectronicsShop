package jdbc;

import java.sql.SQLException;
import java.sql.Statement;

import models.Admin;
import models.BasicUser;
import models.Courier;
import models.TV;

public class WriteDB {
    private static WriteDB writeDB = null;
    private final DBConnection dbconn = DBConnection.getInstance();
    private Statement stmt = null;

    private WriteDB() {
    }

    public static WriteDB getInstance() {
        if(writeDB == null)
        	writeDB = new WriteDB();
        return writeDB;
    }

    public void basicUser(BasicUser user) {
        if(dbconn.getConn() != null) {
            try {
                stmt = dbconn.getConn().createStatement();
                stmt.execute("INSERT INTO basicuser VALUES(" +
                        "\"" + user.getUsername() + "\"" + "," +
                        "\"" + user.getPassword() + "\"" + "," +
                        "\"" + user.getEmail() + "\"" + "," +
                        ")");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void tv(TV tv) {
        if(dbconn.getConn() != null) {
            try {
                stmt = dbconn.getConn().createStatement();
                stmt.execute("INSERT INTO tv VALUES(" +
                        "\"" + tv.getProductName() + "\"" + "," +
                        "\"" + tv.getBrand() + "\"" + "," +
                        "\"" + tv.getWeight() + "\"" +
                        "\"" + tv.getDimensions() + "\"" +
                        "\"" + tv.getColour() + "\"" +
                        "\"" + tv.getPrice() + "\"" +
                        "\"" + tv.getImage() + "\"" +
                        "\"" + tv.getDiagonal() + "\"" +
                        "\"" + tv.getDisplayType() + "\"" +
                        "\"" + tv.getResolution() + "\"" +
                        "\"" + tv.getScreenResolution() + "\"" +
                        "\"" + tv.getIntegratedSpeaker() + "\"" +
                        "\"" + tv.getConnector() + "\"" +
                        "\"" + tv.getHdmiInputs() + "\"" +
                        "\"" + tv.getBluetooth() + "\"" +
                        "\"" + tv.getUsbInput() + "\"" +
                        "\"" + tv.getCiSlot() + "\"" +
                        "\"" + tv.getSmartTVFunctions() + "\"" +
                        "\"" + tv.getPowerConsumption() + "\"" +
                        "\"" + tv.getIncludedAccessories() + "\"" +
                        "\"" + tv.getOthers() + "\"" +
                        "\"" + tv.getTuner() + "\"" +
                        ")");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void courier(Courier courier) {
        if(dbconn.getConn() != null) {
            try {
                stmt = dbconn.getConn().createStatement();
                stmt.execute("INSERT INTO courier VALUES(" +
                        "\"" + courier.getUsername() + "\"" + "," +
                        "\"" + courier.getPassword() + "\"" + "," +
                        courier.getCellPhoneNumber() + "," +            
                        ")");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public void admin(Admin admin) {
        if(dbconn.getConn() != null) {
            try {
                stmt = dbconn.getConn().createStatement();
                stmt.execute("INSERT INTO admin VALUES(" +
                        "\"" + admin.getUsername() + "\"" + "," +
                        "\"" + admin.getPassword() + "\"" + "," +
                        admin.getEmail() + "," +
                        ")");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
