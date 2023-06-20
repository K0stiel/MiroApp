package com.miro.miro.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor

public class ItemsDTO {
    
    int size;
    int limit;
    int total;
    List<ItemDTO> data;
    String cursor;
}
