package com.online.pos.posapi.service.impl;

import com.online.pos.posapi.dto.paginated.ProductListDto;
import com.online.pos.posapi.dto.paginated.converter.ProductConverter;
import com.online.pos.posapi.dto.response.CommonResponseDTO;
import com.online.pos.posapi.dto.response.ResponseProductDTO;
import com.online.pos.posapi.entity.Product;
import com.online.pos.posapi.repo.ProductRepo;
import com.online.pos.posapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public CommonResponseDTO findAll() {
        List<Product> convertableData = productRepo.findAll();

        List<ResponseProductDTO> dtos = new ArrayList<>();
        //**map-structs

        for (Product c : convertableData) {
            dtos.add(
                    new ResponseProductDTO(
                            c.getProduct_property_Id(),
                            c.getDisplayName(),
                            c.getDescription(),
                            c.getUnitPrice(),
                            c.getQty(),
                            c.getSellingPrice()

                    )
            );

        }
        return new CommonResponseDTO(200,"Product List!",new ProductListDto(dtos));
    }

    @Override
    public ResponseProductDTO findProduct(String id) {
        Optional<Product> selectedProduct = productRepo.findById(id);
        if(selectedProduct.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return new ResponseProductDTO(
                selectedProduct.get().getProduct_property_Id(),
                selectedProduct.get().getDisplayName(),
                selectedProduct.get().getDescription(),
                selectedProduct.get().getUnitPrice(),
                selectedProduct.get().getQty(),
                selectedProduct.get().getSellingPrice()


        );
    }

}
