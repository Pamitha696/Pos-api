package com.online.pos.posapi.service.impl;

import com.online.pos.posapi.dto.paginated.PaytypeListDTO;
import com.online.pos.posapi.dto.paginated.ProductListDto;
import com.online.pos.posapi.dto.response.CommonResponseDTO;
import com.online.pos.posapi.dto.response.ResponsePaytypeDTO;
import com.online.pos.posapi.dto.response.ResponseProductDTO;
import com.online.pos.posapi.entity.Paytype;
import com.online.pos.posapi.entity.Product;
import com.online.pos.posapi.repo.PaytypeRepo;
import com.online.pos.posapi.service.PaytypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PaytypeServiceImpl implements PaytypeService {

    private final PaytypeRepo paytypeRepo;
 @Autowired
    public PaytypeServiceImpl(PaytypeRepo paytypeRepo) {
        this.paytypeRepo = paytypeRepo;
    }

    @Override
    public CommonResponseDTO findAll() {
        List<Paytype> convertableData = paytypeRepo.findAll();

        List<ResponsePaytypeDTO> dtos = new ArrayList<>();
        //**map-structs

        for (Paytype c : convertableData) {
            dtos.add(
                    new ResponsePaytypeDTO(
                            c.getPaytypeId(),
                            c.getPayType()


                    )
            );

        }
        return new CommonResponseDTO(200,"Paytype List!",new PaytypeListDTO(dtos));
    }
}
