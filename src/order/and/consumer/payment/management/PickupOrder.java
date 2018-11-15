/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order.and.consumer.payment.management;
import domain.PickUpOrderDomain;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lim Yb
 */
public class PickupOrder extends JFrame {
   // GridBagLayout gridbag = new GridBagLayout();
   // GridBagConstraints c = new GridBagConstraints();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();
    private JLabel jlbDate = new JLabel(dateFormat.format(date));
    private JTextField jtfSearch = new JTextField();
    private JButton jbSearch = new JButton("Search");
    private JButton jbBack = new JButton("Back");
    private JLabel total = new JLabel();
    private JLabel total2 = new JLabel();
    private DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Order id","Product Name","Quantity","Customer Name","Customer Contact"
       ,"Pick Up Time" ,"Address", "Pick Up Method", "Payment Method", "Status"},0); 
    private JTable table = new JTable(tableModel);
    JScrollPane scrollPane = new JScrollPane(table);
    private DefaultTableModel tableModel2 = new DefaultTableModel(new Object[]{"Order id","Product Name","Quantity","Customer Name","Customer Contact"
       ,"Pick Up Time" ,"Address", "Pick Up Method", "Payment Method", "Status"},0); 
    private JTable table2 = new JTable(tableModel2);
    JScrollPane scrollPane2 = new JScrollPane(table2);
    private ResultSet rsBook = null;
    
       
    public PickupOrder(PickUpOrderDomain order1, PickUpOrderDomain order2){
        table = new JTable();
        table.setRowSelectionAllowed(true);
       // table2 = new JTable();
        setLayout(new BorderLayout());
        addDetail(order1, order2);
        JPanel pn0 = new JPanel(new GridLayout(1,2));
        JPanel pn1 = new JPanel(new GridLayout(3,1));
        JPanel pn2 = new JPanel(new GridLayout(7,1));
        JPanel pn3 = new JPanel((new BorderLayout()));
        JPanel pn4 = new JPanel(new FlowLayout(FlowLayout.LEFT));      
        JPanel pn5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel pn6 = new JPanel(new FlowLayout());
        
       // c.fill = GridBagConstraints.BOTH;
        //c.weightx = 0.0;
        //gridbag.setConstraints(jlbDate, c);
        pn1.add(jlbDate);        
        pn0.add(jtfSearch);
        pn0.add(jbSearch);
        pn1.add(pn0);
        pn1.add(new JSeparator());
        pn4.add(total);
        pn5.add(total2);
        pn2.add(new JLabel("Order that customer come and pick up"));
        pn2.add(scrollPane);       
        pn2.add(pn4);
        pn2.add(new JSeparator());
        pn2.add(new JLabel("Order that need to be delivery"));
        pn2.add(scrollPane2);
        pn2.add(pn5);
        pn6.add(jbBack);
        
        add(pn1, BorderLayout.NORTH);
        add(pn2, BorderLayout.CENTER);
        //add(pn3, BorderLayout.CENTER);
        add(pn6, BorderLayout.SOUTH);
        
        getRootPane().setDefaultButton(jbSearch);
        
        
     /*      
        jbBack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                .setTitle("u");
                .setVisible(true);
                .setSize(700,400);
                .setLocationRelativeTo(null);
                .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
            }
        });
    */}
    
    public void addDetail(PickUpOrderDomain order1, PickUpOrderDomain order2){
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        int i = tableModel.getRowCount();
                for (int k=0; k < i; k++){
                    tableModel.removeRow(0);
                }
                tableModel.addRow(new Object[]{order1.getOrderId(),order1.getProductName(),order1.getQuantity(),order1.getCustName(),order1.getCustContact()
                ,order1.getPickUpTime(),order1.getAddress(),order1.getPickUpMethod(),order1.getPaymentMethod(),order1.getStatus()});
                tableModel.addRow(new Object[]{order2.getOrderId(),order2.getProductName(),order2.getQuantity(),order2.getCustName(),order2.getCustContact()
                ,order2.getPickUpTime(),order2.getAddress(),order2.getPickUpMethod(),order2.getPaymentMethod(),order2.getStatus()});

       total.setText("Total Record: " + tableModel.getRowCount());
       total2.setText("Total record: " + tableModel2.getRowCount());
    }
    public static void main(String args[]){
        PickUpOrderDomain order1 = new PickUpOrderDomain("O0001","Rose",2,"Lim Chun Chun","012-3456789"
       ,"12:11 pm" ,"No.01, Jalan Bla...", "Pick Up", "Cash on Delivery", "not yet");
        PickUpOrderDomain order2 = new PickUpOrderDomain("O0002","Orchid",3,"Bryan Loh","012-3456789"
       ,"13:30 pm" ,"No.02, Jalan Bla...", "Pick Up", "Cash on Delivery", "not yet");
        PickupOrder pick = new PickupOrder(order1, order2);
        pick.setVisible(true);
        pick.setTitle("List of Today Orders Pick Up");
        pick.setLocationRelativeTo(null);
        pick.setSize(900, 550);
        pick.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
