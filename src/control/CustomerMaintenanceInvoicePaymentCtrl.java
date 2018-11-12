/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import agileassignment.CustomerInterface;
import da.CustomerMaintenanceInvoicePaymentDA;
import domain.CustomerMaintenanceInvoicePayment;
import java.util.ArrayList;
import java.util.Queue;

/**
 *
 * @author liang
 */
public class CustomerMaintenanceInvoicePaymentCtrl implements CustomerInterface{
    private CustomerMaintenanceInvoicePaymentDA CMIPDA;
    String name = "";
    public CustomerMaintenanceInvoicePaymentCtrl(){
        
        CMIPDA = new CustomerMaintenanceInvoicePaymentDA();
    }
  
     public ArrayList<CustomerMaintenanceInvoicePayment> getCust() {
        return CMIPDA.getCustomer();
    }

    @Override
    public Queue getCustInfo() {
       Queue cust = CMIPDA.getRecord(name);
       
       return cust;
    }

    @Override
    public void setCustName(String name) {
        this.name = name;
    }
}
