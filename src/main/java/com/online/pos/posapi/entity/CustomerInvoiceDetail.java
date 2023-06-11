package com.online.pos.posapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="customer_invoice_detail_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInvoiceDetail {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="selling_price")
    private double sellingPrice;
    @Column(name="unit_price")
    private double unitPrice;
    private double amount;
    private double qty;
     @ManyToOne
     @JoinColumn(name="product_property_Id")
    private Product  product_property_Id;
    @ManyToOne
    @JoinColumn(name="invoice_no")
    @JsonIgnore
    private CustomerInvoiceHeader customerInvoiceHeader;
}
