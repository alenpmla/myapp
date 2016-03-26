package com.example.android_alen.myapplication;

import java.util.ArrayList;

/**
 * Created by Android-Alen on 26-Mar-16.
 */
public class Invoices {

    ArrayList<invoice>invoice;
    String totalresults
            ,startnumber
            ,numreturned;

    public ArrayList<com.example.android_alen.myapplication.invoice> getInvoice() {
        return invoice;
    }

    public void setInvoice(ArrayList<com.example.android_alen.myapplication.invoice> invoice) {
        this.invoice = invoice;
    }

    public String getTotalresults() {
        return totalresults;
    }

    public void setTotalresults(String totalresults) {
        this.totalresults = totalresults;
    }

    public String getStartnumber() {
        return startnumber;
    }

    public void setStartnumber(String startnumber) {
        this.startnumber = startnumber;
    }

    public String getNumreturned() {
        return numreturned;
    }

    public void setNumreturned(String numreturned) {
        this.numreturned = numreturned;
    }


}
