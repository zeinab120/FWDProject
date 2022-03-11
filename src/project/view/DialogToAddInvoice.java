/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Zeinab
 */
public class DialogToAddInvoice extends JDialog {

    private JTextField CustomerNameField;
    private JTextField InvoiceDateField;
    private JLabel CustomerNameLabel;
    private JLabel InvoiceDateLabel;
    private JButton SaveBtn;
    private JButton CancelBtn;

    public DialogToAddInvoice(JframeNew fram) {
        CustomerNameLabel = new JLabel("CustomerName");
        CustomerNameField = new JTextField(20);
        InvoiceDateLabel = new JLabel("InvoiceDate");
        InvoiceDateField = new JTextField(20);
        SaveBtn= new JButton("Save");
        CancelBtn= new JButton("Cancel");
        
        SaveBtn.setActionCommand("CreateInvSave");
        CancelBtn.setActionCommand("CreateInvCancel");
        
        SaveBtn.addActionListener(fram);
        CancelBtn.addActionListener(fram);
        setLayout(new GridLayout(3, 2));
        add(CustomerNameField);
        add(CustomerNameLabel);
        add(InvoiceDateField);
        add(InvoiceDateLabel);
        add(SaveBtn);
        add(CancelBtn);
        
        pack();
    }

    public JTextField getCustomerNameField() {
        return CustomerNameField;
    }

    public JTextField getInvoiceDateField() {
        return InvoiceDateField;
    }
    
}
