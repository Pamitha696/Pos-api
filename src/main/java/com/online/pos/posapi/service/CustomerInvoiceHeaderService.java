package com.online.pos.posapi.service;

import com.online.pos.posapi.dto.response.CommonResponseDTO;
import com.online.pos.posapi.entity.CustomerInvoiceHeader;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CustomerInvoiceHeaderService {
    public List<CustomerInvoiceHeader> findAll();

    public CommonResponseDTO createInvoice( CustomerInvoiceHeader customerInvoiceHeader) throws IOException;
}
