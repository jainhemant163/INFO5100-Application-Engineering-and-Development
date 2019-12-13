/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Customer> {

    private ProductDirectory directory;
    private Date date;

    public Customer(String password, String userName) {
        super(password, userName, "CUSTOMER");
        date = new Date();

    }

    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        // SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a");
        return sdf.format(date);
    }

    public void setDate() {
        this.date = new Date();
    }

    public int compareTo(Customer o) {
        return o.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean verify(String password) {
        if (password.equals(getPassword())) {
            return true;
        }
        return false;
    }

}
