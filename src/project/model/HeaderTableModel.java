package project.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class HeaderTableModel extends AbstractTableModel {
    String[] cols = {"No.", "Invoice Date", "Customer Name", "Total"};
    ArrayList<InvoiceHeader> invoices;

    public HeaderTableModel(ArrayList<InvoiceHeader> invoices) {
        this.invoices= invoices;
    }


    @Override
    public int getRowCount() {
        return invoices.size();
    }

 
    @Override
    public String getColumnName(int column) {
      
        return cols[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader row = invoices.get(rowIndex);
        switch (columnIndex) {
            case 0: return row.getInvNum();
            case 1: return row.getInvDate();
            case 2: return row.getCusName();
            case 3: return row.getInvTotal();
        }
        return "";
    }
   @Override
    public int getColumnCount() {
        return cols.length;
    }

    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }

}


