package project.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Zeinab
 */
public class LineTableModel extends AbstractTableModel {

    String[] cols = {"Item Name", "Item Price", "Count", "Line Total"};
    ArrayList<InvoiceLine> data;

    public LineTableModel(ArrayList<InvoiceLine> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine row = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return row.getItemName();
            case 1:
                return row.getItemPrice();
            case 2:
                return row.getCount();
            case 3:
                return row.getItemTotal();
        }

        return "";
    }

    @Override
    public String getColumnName(int column) {
        System.out.println("columns name");
        return cols[column];
    }

    public ArrayList<InvoiceLine> getData() {
        return data;
    }
}
