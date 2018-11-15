/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;
import domain.InvoicePayment;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import domain.CustomerMaintenance;
import domain.Product;
import control.CustomerMaintenanceCtrl;
import control.ProductCtrl;
/**
 *
 * @author liang
 */
public class InvoicePaymentDA {
    private String host = "jdbc:derby://localhost:1527/agile";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "INVOICE";
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    private String sqlQueryStr = "SELECT * FROM " + tableName;
    private CustomerMaintenanceCtrl CustControl;
    private ProductCtrl prodControl;
    
    public InvoicePaymentDA(){
    createConnection();
    CustControl = new CustomerMaintenanceCtrl();
    prodControl = new ProductCtrl();
    }
    public ArrayList<InvoicePayment> getInv() {
         ArrayList<InvoicePayment> IP = new ArrayList<InvoicePayment>();
         try{
             stmt = conn.prepareStatement(sqlQueryStr);
             rs = stmt.executeQuery();
             CustomerMaintenance cm = CustControl.selectRecord(String name);
             while (rs.next())
                 IP.add(new InvoicePayment(rs.getString("INV_ID"),rs.getString("CUST_ID"),rs.getString("PROD_ID"),rs.getInt("QUANTITY"),rs.getDouble("PRICE")));
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
        
        Queue<CustomerMaintenance> q = new LinkedList<>();
        CustomerMaintenance CMIP = null;
        try{
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, name);            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                CMIP= new CustomerMaintenance(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4).charAt(0),rs.getDate(5),rs.getString(6),rs.getString(7),rs.getDouble(8));
            q.add(CMIP);
            }
        }catch (SQLException ex){
            System.out.println("Error Database");
        }
        return q;
    }
    
   
    }
