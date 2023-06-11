package com.online.pos.posapi.dto.paginated;

import com.online.pos.posapi.dto.response.ResponseProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductListDto {
    private List<ResponseProductDTO> list;
}
