package com.online.pos.posapi.dto.paginated.converter;

public interface ProductConverter {
    public String getPropertyId();
    public String getDisplayName();
    public String getDescription();
    public double getUnitPrice();
    public int getQty();
    public double getSellingPrice();
}
