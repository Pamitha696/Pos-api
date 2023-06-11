package com.online.pos.posapi.api;

import com.online.pos.posapi.dto.response.CommonResponseDTO;
import com.online.pos.posapi.service.PaytypeService;
import com.online.pos.posapi.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/paytypies")
@CrossOrigin
public class PaytypeController {
    private final PaytypeService paytypeService;

    public PaytypeController(PaytypeService paytypeService) {
        this.paytypeService = paytypeService;
    }
    @GetMapping(value = "/member/list")
    public ResponseEntity<StandardResponse> findAll(


    )
    {
        CommonResponseDTO commonResponseDTO = paytypeService.findAll();
        return new ResponseEntity<>(
                new StandardResponse(commonResponseDTO.getCode(),commonResponseDTO.getMessage(),commonResponseDTO.getData()),
                HttpStatus.OK
        );

    }
}
