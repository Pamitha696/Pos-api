package com.online.pos.posapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name="customer_invoice_header_table")
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
    private String paytype1;
    @Column(name="paytype_2")
    private String  paytype2;
    private double  balance;

    @OneToMany(mappedBy = "customerInvoiceHeader",cascade = CascadeType.ALL)
    private List<CustomerInvoiceDetail> invoiceDetailList;


}
