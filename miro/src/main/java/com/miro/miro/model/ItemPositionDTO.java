package com.miro.miro.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor

public class ItemPositionDTO {
    int x;
    int y;
    String origin;
    String relativeTo;
}
