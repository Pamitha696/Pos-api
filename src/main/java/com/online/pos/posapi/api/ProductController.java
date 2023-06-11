package com.online.pos.posapi.api;

import com.online.pos.posapi.dto.response.CommonResponseDTO;
import com.online.pos.posapi.dto.response.ResponseProductDTO;
import com.online.pos.posapi.service.ProductService;
import com.online.pos.posapi.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
@CrossOrigin

public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/member/list")
    public ResponseEntity<StandardResponse> findAll(


    )
    {
        CommonResponseDTO commonResponseDTO = productService.findAll();
        return new ResponseEntity<>(
                new StandardResponse(commonResponseDTO.getCode(),commonResponseDTO.getMessage(),commonResponseDTO.getData()),
                HttpStatus.OK
        );

    }

    @GetMapping("/member/find/{id}")
    public ResponseEntity<StandardResponse>createProduct(@PathVariable String id)
    {
        ResponseProductDTO product = productService.findProduct(id);
        return new ResponseEntity<>(
                new StandardResponse(200, "Product Details",product),
                HttpStatus.OK
        );

    }
}
