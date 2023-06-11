package com.online.pos.posapi.service.impl;

import com.online.pos.posapi.dto.response.CommonResponseDTO;
import com.online.pos.posapi.entity.CustomerInvoiceDetail;
import com.online.pos.posapi.entity.CustomerInvoiceHeader;
import com.online.pos.posapi.repo.CustomerInvoiceDetailRepo;
import com.online.pos.posapi.repo.CustomerInvoiceHeaderRepo;
import com.online.pos.posapi.service.CustomerInvoiceHeaderService;
import com.online.pos.posapi.util.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;


@Service
@Transactional
public class CustomerInvoiceHeaderServiceImpl implements CustomerInvoiceHeaderService {

    private final CustomerInvoiceHeaderRepo customerInvoiceHeaderRepo;
    private final CustomerInvoiceDetailRepo customerInvoiceDetailRepo;


    private final Generator generator;
    @Autowired
    public CustomerInvoiceHeaderServiceImpl(CustomerInvoiceHeaderRepo customerInvoiceHeaderRepo, CustomerInvoiceDetailRepo customerInvoiceDetailRepo, Generator generator) {
        this.customerInvoiceHeaderRepo = customerInvoiceHeaderRepo;
        this.customerInvoiceDetailRepo = customerInvoiceDetailRepo;
        this.generator = generator;
    }

    @Override
    public List<CustomerInvoiceHeader> findAll() {
        return customerInvoiceHeaderRepo.findAll();
    }

    @Override
    public CommonResponseDTO createInvoice(CustomerInvoiceHeader customerInvoiceHeader) throws IOException {




        CustomerInvoiceHeader cusinvoicehead = new CustomerInvoiceHeader(
                generator.generateKey("IN"),
               customerInvoiceHeader.getInvoiceDate(),
               customerInvoiceHeader.getTotal(),
               customerInvoiceHeader.getDiscount(),
               customerInvoiceHeader.getNetTotal(),
               customerInvoiceHeader.getPaytype1(),
               null,
               customerInvoiceHeader.getBalance(),
                null

       );
         customerInvoiceHeaderRepo.save(cusinvoicehead);

        for(CustomerInvoiceDetail c : customerInvoiceHeader.getInvoiceDetailList()){
            CustomerInvoiceDetail customerInvoiceDetail=new CustomerInvoiceDetail(
                    0,
                    c.getSellingPrice(),
                    c.getUnitPrice(),
                    c.getAmount(),
                    c.getQty(),
                    c.getProduct_property_Id(),
                    cusinvoicehead

            );
            customerInvoiceDetailRepo.save(customerInvoiceDetail);
        }
         return new CommonResponseDTO(201,"Saved!",null);
    }


}
