package com.example.android_alen.myapplication;

/**
 * Created by Android-Alen on 26-Mar-16.
 */
public class invoice {


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaxrate2() {
        return taxrate2;
    }

    public void setTaxrate2(String taxrate2) {
        this.taxrate2 = taxrate2;
    }

    public String getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(String taxrate) {
        this.taxrate = taxrate;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTax2() {
        return tax2;
    }

    public void setTax2(String tax2) {
        this.tax2 = tax2;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getDatepaid() {
        return datepaid;
    }

    public void setDatepaid(String datepaid) {
        this.datepaid = datepaid;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInvoicenum() {
        return invoicenum;
    }

    public void setInvoicenum(String invoicenum) {
        this.invoicenum = invoicenum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrencysuffix() {
        return currencysuffix;
    }

    public void setCurrencysuffix(String currencysuffix) {
        this.currencysuffix = currencysuffix;
    }

    public String getCurrencyprefix() {
        return currencyprefix;
    }

    public void setCurrencyprefix(String currencyprefix) {
        this.currencyprefix = currencyprefix;
    }

    public String getCurrencycode() {
        return currencycode;
    }

    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    String  id
            ,userid
            ,firstname
            ,lastname
            ,companyname
            ,invoicenum
            ,date
            ,duedate
            ,datepaid
            ,subtotal
            ,credit
            ,tax
            ,tax2
            ,total
            ,taxrate
            ,taxrate2
            ,status
            ,paymentmethod
            ,notes
            ,currencycode
            ,currencyprefix
            ,currencysuffix
            ,description;
}
