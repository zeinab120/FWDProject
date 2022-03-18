/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import project.view.JframeNew;

/**
 *
 * @author Zeinab
 */
public class DialogForInvoiceLine extends JDialog{

    private JTextField ItemNameField;
    private JTextField ItemPriceField;
    private JTextField ItemCountField;
    private JLabel ItemNameLabel;
    private JLabel ItemPriceLabel;
    private JLabel ItemCountLabel;
    private JButton SaveBtn;
    private JButton CancelBtn;

    public DialogForInvoiceLine(JframeNew fram) {
        ItemNameLabel = new JLabel("ItemName");
        ItemNameField = new JTextField(20);
        ItemPriceLabel = new JLabel("ItemPrice");
        ItemPriceField = new JTextField(20);
        ItemCountLabel = new JLabel("ItemCount");
        ItemCountField = new JTextField(20);
        SaveBtn = new JButton("Save");
        CancelBtn = new JButton("Cancel");

        SaveBtn.setActionCommand("CreateLinesSave");
        CancelBtn.setActionCommand("CreateLinesCancel");

        SaveBtn.addActionListener(fram);
        CancelBtn.addActionListener(fram);
        setLayout(new GridLayout(4, 2));
        add(ItemNameField);
        add(ItemNameLabel);
        add(ItemPriceField);
        add(ItemPriceLabel);
        add(ItemCountField);
        add(ItemCountLabel);
        add(SaveBtn);
        add(CancelBtn);

        pack();
    
    }

    public JTextField getItemNameField() {
        return ItemNameField;
    }

    public JTextField getItemPriceField() {
        return ItemPriceField;
    }

    public JTextField getItemCountField() {
        return ItemCountField;
    }
    
}
