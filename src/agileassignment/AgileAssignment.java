/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment;

import control.CustomerMaintenanceInvoicePaymentCtrl;
import java.util.Scanner;
import da.CustomerMaintenanceInvoicePaymentDA;

/**
 *
 * @author liang
 */
public class AgileAssignment {

    /**
     * @param args the command line arguments
     */
    private static CustomerInterface CI = new CustomerMaintenanceInvoicePaymentCtrl();
    public static void main(String[] args) {
        // TODO code application logic here
        
//        System.out.print("Customer Type: 1. Consumer 2. Corporate Customer? (Enter Number)");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        CI.setCustName(name);
        System.out.println(CI.getCustInfo());
        
//        if(category==1){
//            System.out.println("ID : C0001");
//            System.out.println("Name : Loh Hong Liang");
//            System.out.println("Category: Customer");
//            System.out.println("Gender: M");
//            System.out.println("Date of Birth: 1997-06-23");
//            System.out.println("Phone: 012-6427012");
//            System.out.println("Address: hahahafdajfbasdbfkfbkdsf");
//            System.out.println("Credit Limit: 0");
//        }else if(category==2){
//            System.out.println("ID : C0002");
//            System.out.println("Name : Cheong Li Jie");
//            System.out.println("Category: Customer");
//            System.out.println("Gender: M");
//            System.out.println("Date of Birth: 1996-10-14");
//            System.out.println("Phone: 011-1221312");
//            System.out.println("Address: hahahafdafdfdsjfbasdbfkfbkdsf");
//            System.out.println("Credit Limit: 2000");
//            System.out.println("*****This customer not allow to make another purchase before the credit limit did not clear*****");
//            
//        }else{
//            System.out.println("")
//            
//        }
    }
    
}
