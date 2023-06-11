package com.online.pos.posapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseProductDTO {

   private String propertyId;
   private String displayName;
   private String description;
   private double unitPrice;
   private int qty;
   private double sellingPrice;

}
/*property_id, display_name, description, unit_price, qty, images, selling_price*/