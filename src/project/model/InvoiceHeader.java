/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Zeinab
 */
public class InvoiceHeader {

    private int invNum;
    private Date invDate;
    private String cusName;
    private double InvTotal;
    private ArrayList<InvoiceLine> lines;

    public InvoiceHeader(int invNum, Date invDate, String cusName) {
        this.invNum = invNum;
        this.invDate = invDate;
        this.cusName = cusName;
    }

    public int getInvNum() {
        return invNum;
    }

    public void setInvNum(int invNum) {
        this.invNum = invNum;
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public double getInvTotal() {
        return InvTotal;
    }

    public void setInvTotal(double InvTotal) {
        this.InvTotal = InvTotal;
    }

        public ArrayList<InvoiceLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
}
    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    public void addLine(InvoiceLine Line){
     getLines().add(Line);
       setInvTotal(getInvTotal()+Line.getItemTotal());
       
    }
    
}