/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment;

import control.CustomerMaintenanceCtrl;
import java.util.Scanner;
import da.CustomerMaintenanceDA;

/**
 *
 * @author liang
 */
public class AgileAssignment {

    /**
     * @param args the command line arguments
     */
    private static CustomerInterface CI = new CustomerMaintenanceCtrl();
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter corporate customer name: ");
//        System.out.print("Customer Type: 1. Consumer 2. Corporate Customer? (Enter Number)");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        CI.setCustName(name);
        System.out.println(CI.getCustInfo());
        
    }
    
}
