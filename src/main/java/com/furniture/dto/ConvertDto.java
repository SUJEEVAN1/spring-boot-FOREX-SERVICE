package com.furniture.dto;

import lombok.Data;

@Data
public class ConvertDto {
    private String fromCurrency;
    private String toCurrency;
    private Double amount;
}
