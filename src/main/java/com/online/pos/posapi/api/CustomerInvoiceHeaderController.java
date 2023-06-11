package com.online.pos.posapi.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.online.pos.posapi.dto.response.CommonResponseDTO;
import com.online.pos.posapi.entity.CustomerInvoiceHeader;
import com.online.pos.posapi.service.CustomerInvoiceHeaderService;
import com.online.pos.posapi.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customerinvoiceheaders")
@CrossOrigin
public class CustomerInvoiceHeaderController {
    private final CustomerInvoiceHeaderService customerInvoiceHeaderService;

    public CustomerInvoiceHeaderController(CustomerInvoiceHeaderService customerInvoiceHeaderService) {
        this.customerInvoiceHeaderService = customerInvoiceHeaderService;
    }

    @GetMapping(value = "/member/list")

    public List<CustomerInvoiceHeader> findAll(


    )
    {

        return customerInvoiceHeaderService.findAll();

    }
    @PostMapping("/member/create")
    public ResponseEntity<StandardResponse> createProduct(
            @RequestBody CustomerInvoiceHeader data

    ) throws IOException {


        CommonResponseDTO savedData = customerInvoiceHeaderService.createInvoice(data);
        return new ResponseEntity<>(
                new StandardResponse(savedData.getCode(), savedData.getMessage(),savedData.getData()),
                HttpStatus.CREATED
        );

    }

}
