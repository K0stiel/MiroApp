package com.miro.miro.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor

public class ItemDTO {
    
    String id;
    String type; 
    ItemDataDTO data;
    ItemStyleDTO style;
    ItemPositionDTO position;
}
