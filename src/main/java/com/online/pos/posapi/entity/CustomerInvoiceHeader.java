package com.online.pos.posapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="customer_invoice_detail_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInvoiceHeader {
    @Id
    @Column(name="invoice_no")
    private String invoiceNo;
    @Column(name="invoice_date")
    private Date invoiceDate;
    private double total;
    private double discount;
    @Column(name="net_Total")
    private double netTotal;
    @Column(name="paytype_1")
    private double paytype1;
    @Column(name="paytype_2")
    private double  paytype2;
    private double  balance;


}
