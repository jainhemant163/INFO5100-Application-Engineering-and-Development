/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JAINHEMANT
 */
public class CarDirectory {
    
     private ArrayList<Car> carList;
     private Date date;

    public String getDate() {
         SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
       // SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a");
        return sdf.format(date);
    }

    public void setDate() {
        this.date = new Date();
    }  
     

    public CarDirectory() {
        carList = new ArrayList<Car>();
        setDate();
    }

     
    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
        setDate();
    }
     
    public void addCarList(Car car){
        carList.add(car);
        setDate();
    }

     
}
