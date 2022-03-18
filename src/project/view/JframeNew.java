/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.DataFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import project.Controller.HeaderTable;
import project.Controller.LineTable;
import project.model.InvoiceHeader;
import project.model.InvoiceLine;

/**
 *
 * @author Zeinab
 */
/**
 * Creates new form NewJFrame1
 */
public class JframeNew extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

    public JframeNew() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        headerTable = new javax.swing.JTable();
        headerTable.getSelectionModel().addListSelectionListener(this);
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(this);
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(this);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        InvNumber = new javax.swing.JLabel();
        CustomerNameF = new javax.swing.JTextField();
        InvDtF = new javax.swing.JTextField();
        InvTotal = new javax.swing.JLabel();
        insertItemBtn = new javax.swing.JButton();
        insertItemBtn.addActionListener(this);
        jButton4 = new javax.swing.JButton();
        jButton4.addActionListener(this);
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        loadFileMenuItem.addActionListener(this);
        saveFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NO.", "Date", "Customer", "Total"
            }
        ));
        headerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(headerTable);

        jButton1.setText("Create New Invoice");
        jButton1.setActionCommand("CreateInv");

        jButton2.setText("Delete Invoice");
        jButton2.setActionCommand("DeleteInv");

        jLabel1.setText("Invoice Num.");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("invoiceTotal");

        lineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(lineTable);

        CustomerNameF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerNameFActionPerformed(evt);
            }
        });

        InvDtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvDtFActionPerformed(evt);
            }
        });

        insertItemBtn.setText("InsertNewItem");
        insertItemBtn.setActionCommand("InsertItem");
        insertItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertItemBtnActionPerformed(evt);
            }
        });

        jButton4.setText("DeleteItem");
        jButton4.setActionCommand("DeleteItem");

        jLabel5.setText("Invoice Tabel");

        jMenu1.setText("File");

        loadFileMenuItem.setText("Load File");
        loadFileMenuItem.setActionCommand("L");
        loadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadFileMenuItem);

        saveFileMenuItem.setText("Save");
        saveFileMenuItem.setActionCommand("S");
        saveFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvDtF)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InvTotal)
                                    .addComponent(InvNumber))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(CustomerNameF)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1)
                .addGap(75, 75, 75)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertItemBtn)
                .addGap(154, 154, 154)
                .addComponent(jButton4)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(InvNumber)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(InvDtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CustomerNameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(InvTotal))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertItemBtn)
                            .addComponent(jButton4)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        insertItemBtn.getAccessibleContext().setAccessibleName("InsertItem");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InvDtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvDtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvDtFActionPerformed

    private void CustomerNameFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerNameFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerNameFActionPerformed

    private void loadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileMenuItemActionPerformed
       
        try {
            loadFile();
        } catch (Exception ex) {
            Logger.getLogger(JframeNew.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_loadFileMenuItemActionPerformed

    private void insertItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertItemBtnActionPerformed

    private void saveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileMenuItemActionPerformed
        try {
            // TODO add your handling code here:
            SaveFiles();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JframeNew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveFileMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JframeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerNameF;
    private javax.swing.JTextField InvDtF;
    private javax.swing.JLabel InvNumber;
    private javax.swing.JLabel InvTotal;
    private javax.swing.JTable headerTable;
    private javax.swing.JButton insertItemBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lineTable;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables

    private ArrayList<InvoiceHeader> filesData = new ArrayList<>();
    private HeaderTable headerTableModel;
    private LineTable lineTableModel;
    private SimpleDateFormat DateFormat = new SimpleDateFormat("dd-mm-yyyy");
    private DialogToAddInvoice Dialog;
    private DialogForInvoiceLine LineDialog;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Action")) {
            saveData();
        } else if (e.getActionCommand().equals("CreateInv")) {
            createInvoice();
        } else if (e.getActionCommand().equals("DeleteInv")) {
            deleteInvoce();
        } else if (e.getActionCommand().equals("InsertItem")) {
            createItemnew();
        } else if (e.getActionCommand().equals("DeleteItem")) {
            deleteItemnew();
        } else if (e.getActionCommand().equals("CreateInvSave")) {
            try {
                CreateInvSave();
            } catch (ParseException ex) {
                Logger.getLogger(JframeNew.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("CreateInvCancel")) {
            CreateInvCancel();
        } else if (e.getActionCommand().equals("CreateLinesSave")) {
            CreateLineSave();
        } else if (e.getActionCommand().equals("CreateLinesCancel")) {
            CreateLinesCancel();
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        HeaderTableRowsSelected();
    }

    private InvoiceHeader findByNum(int num) {
        for (InvoiceHeader header : filesData) {
            if (header.getInvNum() == num) {
                return header;
            }
        }
        return null;
    }

    private void loadFile() throws Exception {
        filesData.clear();
        JOptionPane.showMessageDialog(this, "Please select your files Invoice header", "Invoice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fileChooser = new JFileChooser();
        int Selection = fileChooser.showOpenDialog(this);
        if (Selection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            FileReader fileReader = new FileReader(selectedFile);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferReader.readLine()) != null) {
                String[] headerSegments = line.split(",");
                String invNumStr = headerSegments[0];
                String invDateStr = headerSegments[1]; // "20-12-2020"
                String custName = headerSegments[2];
                int invNum = Integer.parseInt(invNumStr);
                Date invDate = DateFormat.parse(invDateStr);
                InvoiceHeader header = new InvoiceHeader(invNum, invDate, custName);
                filesData.add(header);
            }
            bufferReader.close();
            fileReader.close();
            System.out.println("check");
            JOptionPane.showMessageDialog(this, "Please select Invoice lines file", "Invoice Lines", JOptionPane.WARNING_MESSAGE);
            Selection = fileChooser.showOpenDialog(this);
            if (Selection == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                fileReader = new FileReader(selectedFile);
                bufferReader = new BufferedReader(fileReader);
                line = null;
                while ((line = bufferReader.readLine()) != null) {
                    String[] lineSegments = line.split(",");
                    String invNumStr = lineSegments[0];
                    String item = lineSegments[1]; // "20-12-2020"
                    String priceStr = lineSegments[2];
                    String countStr = lineSegments[3];
                    int invNum = Integer.parseInt(invNumStr);
                    double price = Double.parseDouble(priceStr);
                    int count = Integer.parseInt(countStr);
                    InvoiceHeader header = findByNum(invNum);
                    InvoiceLine invLines = new InvoiceLine(item, price, count, header);
                    header.addLines(invLines);
                }
                bufferReader.close();
                fileReader.close();
                headerTableModel = new HeaderTable(filesData);
                headerTable.setModel(headerTableModel);
                headerTable.validate();
            }
        }
    }

    private void saveData() {
    }

    private void createInvoice() {
        Dialog = new DialogToAddInvoice(this);
        Dialog.setVisible(true);
    }

    private void deleteInvoce() {
        int SelectedRowIndex = headerTable.getSelectedRow();
        headerTableModel.removeRow(SelectedRowIndex);
        headerTableModel.fireTableDataChanged();
        lineTableModel.fireTableDataChanged();

    }

    private void createItemnew() {
        LineDialog = new DialogForInvoiceLine(this);
        LineDialog.setVisible(true);
    }

    private void deleteItemnew() {
        int SelectedRowIndex = lineTable.getSelectedRow();
        lineTableModel.removeRow(SelectedRowIndex);
        lineTableModel.fireTableDataChanged();
        headerTableModel.fireTableDataChanged();

    }

  

    private void HeaderTableRowsSelected() {
        int selectedRowIndex = headerTable.getSelectedRow();
        if (selectedRowIndex >= 0) {
            InvoiceHeader row = headerTableModel.getInvoices().get(selectedRowIndex);
            CustomerNameF.setText(row.getCusName());
            InvDtF.setText(row.getInvDate().toString());
            InvNumber.setText("" + row.getInvNum());
            jLabel4.setText("" + row.getInvTotal());
            ArrayList<InvoiceLine> lines = row.getLines();
            lineTableModel = new LineTable(lines);
            lineTable.setModel(lineTableModel);
            lineTableModel.fireTableDataChanged();
        }
    }

    private void CreateInvSave() throws ParseException {
        String CustomerName = Dialog.getCustomerNameField().getText();
        String InvoiceDateStr = Dialog.getInvoiceDateField().getText();
        Date InvoiceDate = new Date();
        try {
            InvoiceDate = DateFormat.parse(InvoiceDateStr);

        } catch (ParseException ex) {
        }

        Dialog.setVisible(false);
        int Number = getNewInvoiceNumber() + 1;
        InvoiceHeader newInvoiceData = new InvoiceHeader(Number, InvoiceDate, CustomerName);
        filesData.add(newInvoiceData);
        headerTableModel.fireTableDataChanged();

    }

    private void CreateInvCancel() {
        Dialog.setVisible(false);
    }

    private int getNewInvoiceNumber() {
        int Number = 0;
        for (InvoiceHeader Header : filesData) {
            if (Header.getInvNum() > Number) {
                Number = Header.getInvNum();
            }
        }
        return Number;
    }

    private void CreateLineSave() {
        String ItemName = LineDialog.getItemNameField().getText();
        String ItemCountStr = LineDialog.getItemCountField().getText();
        String ItemPriceStr = LineDialog.getItemPriceField().getText();
        LineDialog.setVisible(false);
        int ItemCount = Integer.parseInt(ItemCountStr);
        double ItemPrice = Double.parseDouble(ItemPriceStr);
        int rowselect = headerTable.getSelectedRow();
        if (rowselect >= 0) {
            InvoiceHeader InvoiceHeader = filesData.get(rowselect);

            InvoiceLine Line = new InvoiceLine(ItemName, ItemPrice, ItemCount, InvoiceHeader);
            InvoiceHeader.addLines(Line);

            lineTableModel.fireTableDataChanged();
            headerTableModel.fireTableDataChanged();
        }
    }

    private void CreateLinesCancel() {
        LineDialog.setVisible(false);
    }

    private void SaveFiles() throws FileNotFoundException {
        JOptionPane.showMessageDialog(this, "Please Chosce File Header to Save", "Invooice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fileChoosers = new JFileChooser();
        int option = fileChoosers.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File Csvfile = fileChoosers.getSelectedFile();
            PrintWriter file = new PrintWriter(Csvfile);

            for (InvoiceHeader header : filesData) {
                file.printf("%d,%s,%s%n", header.getInvNum(), DateFormat.format(header.getInvDate()), header.getCusName());
                //file.println();
            }
            file.close();
            JOptionPane.showMessageDialog(this, "Successfully Header Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(this, "Please Chosce File Line to Save", "Invooice Line", JOptionPane.WARNING_MESSAGE);
        fileChoosers = new JFileChooser();
        option = fileChoosers.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File Csvfilee = fileChoosers.getSelectedFile();
            PrintWriter FileLines = new PrintWriter(Csvfilee);

            for (InvoiceHeader header : filesData) {
                for (InvoiceLine Lines : header.getLines()) {
                    FileLines.printf("%d,%s,%f,%d%n",Lines.getInvoiceHeader().getInvNum(), 
                            Lines.getItemName(), Lines.getItemPrice(), Lines.getCount());
                    //FileLines.println();
                }
            }
            FileLines.close();
            JOptionPane.showMessageDialog(this, "Successfully Lines Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
