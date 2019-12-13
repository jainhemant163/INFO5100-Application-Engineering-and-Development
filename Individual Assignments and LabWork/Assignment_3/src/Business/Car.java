/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author JAINHEMANT
 */
public class Car {
    
    private String modelName;
    private String modelNo;
    private String serialNo;
    private String manufacturer;
    private String manufactureyear;
    private Boolean availability;
    private int minSeat;
    private int maxSeat;
    private String availableCity;
    private String maintainCert;
    
    //Default Constructor
    public Car() {
   
    }
    
    //Parameterised Constructor

    public Car(String modelName, String modelNo, String serialNo, String manufacturer, String manufactureyear, Boolean availability, int minSeat, int maxSeat, String availableCity, String maintainCert) {
        this.modelName = modelName;
        this.modelNo = modelNo;
        this.serialNo = serialNo;
        this.manufacturer = manufacturer;
        this.manufactureyear = manufactureyear;
        this.availability = availability;
        this.minSeat = minSeat;
        this.maxSeat = maxSeat;
        this.availableCity = availableCity;
        this.maintainCert = maintainCert;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufactureyear() {
        return manufactureyear;
    }

    public void setManufactureyear(String manufactureyear) {
        this.manufactureyear = manufactureyear;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public int getMinSeat() {
        return minSeat;
    }

    public void setMinSeat(int minSeat) {
        this.minSeat = minSeat;
    }

    public int getMaxSeat() {
        return maxSeat;
    }

    public void setMaxSeat(int maxSeat) {
        this.maxSeat = maxSeat;
    }

    public String getAvailableCity() {
        return availableCity;
    }

    public void setAvailableCity(String availableCity) {
        this.availableCity = availableCity;
    }

    public String getMaintainCert() {
        return maintainCert;
    }

    public void setMaintainCert(String maintainCert) {
        this.maintainCert = maintainCert;
    }
  
    public String toString()
    {
        return this.manufacturer+" "+this.modelName;
    }

   
    
}
