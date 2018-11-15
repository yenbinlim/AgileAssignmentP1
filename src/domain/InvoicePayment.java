/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import java.io.Serializable;
import java.sql.*;
import java.util.Objects;

/**
 *
 * @author liang
 */
public class InvoicePayment implements Serializable{
    private String inv_ID;
    private String cust_ID;
    private CustomerMaintenance customer;
    private Product product;

    public InvoicePayment(String inv_ID, String cust_ID, CustomerMaintenance customer, Product product) {
        this.inv_ID = inv_ID;
        this.cust_ID = cust_ID;
        this.customer = customer;
        this.product = product;
    }

    public String getInv_ID() {
        return inv_ID;
    }

    public void setInv_ID(String inv_ID) {
        this.inv_ID = inv_ID;
    }

    public String getCust_ID() {
        return cust_ID;
    }

    public void setCust_ID(String cust_ID) {
        this.cust_ID = cust_ID;
    }

    public CustomerMaintenance getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerMaintenance customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.inv_ID);
        hash = 23 * hash + Objects.hashCode(this.cust_ID);
        hash = 23 * hash + Objects.hashCode(this.customer);
        hash = 23 * hash + Objects.hashCode(this.product);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InvoicePayment other = (InvoicePayment) obj;
        if (!Objects.equals(this.inv_ID, other.inv_ID)) {
            return false;
        }
        if (!Objects.equals(this.cust_ID, other.cust_ID)) {
            return false;
        }
        if (!Objects.equals(this.customer, other.customer)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Invoice ID= " + inv_ID + "\nCustomer ID= " + cust_ID + "\nCustomer= " + customer + "\nProduct=" + product ;
    }
    
    
}
