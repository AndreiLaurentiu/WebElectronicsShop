package jdbc;

import java.io.IOException;
import java.sql.*;

import csvs.Log;
import models.Admin;
import models.BasicUser;
import models.Courier;
import models.TV;
import services.ServiceAdmin;
import services.ServiceBasicUser;
import services.ServiceCourier;
import services.ServiceTVs;

public class ReadDB {
    private static ReadDB readDB = null;

    private ReadDB() {
    }

    public static ReadDB getInstance() {
        if(readDB == null)
        	readDB = new ReadDB();
        return readDB;
    }

    private void loadBasicUsers(ServiceBasicUser service, Statement statement) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM basicuser");
            while(rs.next()) {
                service.addBasicUser(new BasicUser(rs.getString("username"),
                									rs.getString("password"),
                									rs.getString("emailAddress")
                									));
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
    
    private void loadTVs(ServiceTVs service, Statement statement) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM tv");
            while(rs.next()) {
                service.addTV(new TV(rs.getString("productName"),
                		                   rs.getString("brand"), rs.getFloat("weight"), rs.getString("dimensions"), rs.getString("colour"),
                		                   rs.getInt("price"), rs.getString("image") ,rs.getString("diagonal"), rs.getString("displayType"), rs.getString("resolution"),
                		                   rs.getString("screenResolution"), rs.getString("curbed"), rs.getString("imageCharacteristics"), 
                		                   rs.getString("soundCharacteristics"), rs.getString("integratedSpeaker"), rs.getString("connector"),
                		                   rs.getString("hdmiInputs"), rs.getString("bluetooth"), rs.getString("usbinput"), rs.getString("ciSlot"),
                		                   rs.getString("smartTVFunctions"), rs.getString("powerConsumption"), rs.getString("includedAccessories"),
                		                   rs.getString("others"), rs.getString("tuner")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void loadCouriers(ServiceCourier service, Statement statement) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM courier");
            while(rs.next()) {
                service.addCourier(
                        new Courier(rs.getString("name"),
								rs.getString("password"),
								rs.getString("cellPhoneNumber")
								)
                        );
                
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
    
    
    private void loadAdmins(ServiceAdmin service, Statement statement) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM admin");
            while(rs.next()) {
                service.addAdmin(new Admin(rs.getString("username"), rs.getString("password"), rs.getString("emailAddress")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void loadObjects(ServiceBasicUser serviceBUser, ServiceTVs serviceTV, ServiceCourier serviceCourier, ServiceAdmin serviceAdmin) {
        try {
            Log.log("Loading objects from MySQL database...");
            DBConnection dbconn = DBConnection.getInstance();
            Statement stmt = dbconn.getConn().createStatement();

            loadBasicUsers(serviceBUser, stmt);
            loadTVs(serviceTV, stmt);
            loadCouriers(serviceCourier, stmt);
            loadAdmins(serviceAdmin, stmt);
            
            Log.log("Done loading!");
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
