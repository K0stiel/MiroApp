package com.miro.miro.service.implementation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.miro.miro.dto.ItemDTO;
import com.miro.miro.service.ItemService;

@Service
public class ItemServiceInDatabaseImpl implements ItemService{

    private Map<Integer, ItemDTO> persist = new HashMap<>();

    @Override
    public void addItem(int id, String type) {
        
        persist.put(id, new ItemDTO());
    }

    @Override
    public ItemDTO getItem(int id) {
        
        return persist.get(id);
    }
    
}
