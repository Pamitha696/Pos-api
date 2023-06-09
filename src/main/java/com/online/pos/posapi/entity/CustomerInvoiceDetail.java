package com.online.pos.posapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="customer_invoice_header_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInvoiceDetail {
    @Id
    @Column(name="invoice_no")
    private String invoiceNo;

    @Column(name="selling_price")
    private double sellingPrice;
    @Column(name="unit_price")
    private double unitPrice;
    private String amount;
    private double qty;
     @ManyToOne
     @JoinColumn(name="product_property_Id")
    private Product  product_property_Id;

}
