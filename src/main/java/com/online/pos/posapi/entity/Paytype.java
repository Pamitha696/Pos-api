package com.online.pos.posapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="paytype_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paytype {
    @Id
    @Column(name="paytype_Id")
    private String paytypeId;
    @Column(name="pay_type")
    private String payType;
}
