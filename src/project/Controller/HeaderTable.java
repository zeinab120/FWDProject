package project.Controller;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import project.model.InvoiceHeader;

public class HeaderTable extends DefaultTableModel {
    String[] cols = {"No.", "Invoice Date", "Customer Name", "Total"};
    ArrayList<InvoiceHeader> invoices = new ArrayList<>();

    public HeaderTable(ArrayList<InvoiceHeader> invoices) {
        this.invoices= invoices;
    }


    @Override
    public int getRowCount() {
             if(this.invoices==null)
             invoices=new ArrayList<>();
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

    @Override
    public void removeRow(int i) {
        invoices.remove(i);
    }
    
    

}


