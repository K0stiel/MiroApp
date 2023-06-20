package com.miro.miro.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor

public class ItemStyleDTO {
    String fillColor;
    String fillOpacity;
    String fontFamily;
    String fontSize;
    String borderColor;
    String borderWidth;    
    String borderOpacity;
    String borderStyle;
    String textAlign;
    String textAlignVertical;
    String color;
}
