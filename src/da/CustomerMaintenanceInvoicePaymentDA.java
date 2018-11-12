/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;
import domain.CustomerMaintenanceInvoicePayment;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author liang
 */
public class CustomerMaintenanceInvoicePaymentDA {
    private String host = "jdbc:derby://localhost:1527/agile";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "CUSTOMER";
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    private String sqlQueryStr = "SELECT * FROM " + tableName;
    
    public CustomerMaintenanceInvoicePaymentDA(){
    createConnection();
    }
    public ArrayList<CustomerMaintenanceInvoicePayment> getCustomer() {
         ArrayList<CustomerMaintenanceInvoicePayment> CMIP = new ArrayList<CustomerMaintenanceInvoicePayment>();
         try{
             stmt = conn.prepareStatement(sqlQueryStr);
             rs = stmt.executeQuery();
             while (rs.next())
                 CMIP.add(new CustomerMaintenanceInvoicePayment(rs.getString("CUST_ID"),rs.getString("CUST_NAME"),rs.getString("CUST_CATEGORY"),rs.getString("CUST_GENDER").charAt(0),rs.getDate("CUST_DOB"), rs.getString("CUST_PHONE"),rs.getString("CUST_ADDRESS"),rs.getDouble("CUST_LIMIT")));
         }catch(SQLException ex){
             ex.getMessage();
         }
         return CMIP;
    }
    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            System.out.print("ERRROR");
        }
    }
    
    public Queue getRecord(String name){
        String queryStr = "SELECT * FROM " + tableName + " WHERE CUST_NAME = ?";
        
        Queue<CustomerMaintenanceInvoicePayment> q = new LinkedList<>();
        CustomerMaintenanceInvoicePayment CMIP = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, name);            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                CMIP= new CustomerMaintenanceInvoicePayment(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4).charAt(0),rs.getDate(5),rs.getString(6),rs.getString(7),rs.getDouble(8));
            q.add(CMIP);
            }
        }catch (SQLException ex){
            System.out.println("Error Database");
        }
        return q;
    }
    
   
    }
