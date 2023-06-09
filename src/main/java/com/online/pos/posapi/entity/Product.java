package com.online.pos.posapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name="product_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name="product_property_Id")
    private String product_property_Id;
    @Column(name="display_name")
    private String displayName;

    private String description;
    @Column(name="unit_price")
    private double unitPrice;

    private int qty;
    @Column(name="selling_price")
    private double sellingPrice;
     @OneToMany(mappedBy = "product_property_Id")
    private List<CustomerInvoiceDetail> invoiceDetailList;

}
