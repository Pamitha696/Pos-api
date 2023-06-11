package com.online.pos.posapi.service;

import com.online.pos.posapi.dto.response.CommonResponseDTO;
import com.online.pos.posapi.dto.response.ResponseProductDTO;
import com.online.pos.posapi.entity.Product;

import java.util.List;

public interface ProductService {
   public CommonResponseDTO findAll();

    public ResponseProductDTO findProduct(String id);
}
