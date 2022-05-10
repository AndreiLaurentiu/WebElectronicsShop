package models;

import java.util.Arrays;

public class Courier {
    private int idCourier;
    private String name;
    private String password;

    public Courier(int idCourier, String name, String password) {
        this.idCourier = idCourier;
        this.name = name;
        this.password = password;
    }

    // 10/12/2022
    public boolean acceptDelivery(String date){
        int[] dateFormat = new int[3];
        String[] string = date.split("/");
        for(int i=0; i<2; i++)
            dateFormat[i] = Integer.parseInt(string[i]);
        //TODO: trebuie facuta o verificare la nivelul bazei de date daca este liber curierul
        return true;

    }
}
