package com.online.pos.posapi.entity;

import java.util.Date;

public class CustomerInvoiceHeader {
    private String invoiceNo;
    private Date invoiceDate;
    private double total;
    private double discount;
    private double netTotal;
    private double paytype1;
    private double  paytype2;
    private double  balance;
    private Date  createdDate;
    private String createdBy;
}
