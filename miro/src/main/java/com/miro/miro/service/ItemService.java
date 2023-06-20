package com.miro.miro.service;

import com.miro.miro.dto.ItemDTO;

public interface ItemService{
    
    void addItem(int id, String type);

    ItemDTO getItem(int id);
}