package com.miro.miro.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.miro.miro.dto.ItemDTO;
import com.miro.miro.dto.ItemsDTO;

import lombok.extern.slf4j.Slf4j;

/*
 * board_id = uXjVM_nWdxc=
 * Access Token: eyJtaXJvLm9yaWdpbiI6ImV1MDEifQ_my0EIwfgpkyBJ77AXbZnYAuWrCw
 */

@Slf4j
@RestController
public class ItemController {
    
    String accessToken = "eyJtaXJvLm9yaWdpbiI6ImV1MDEifQ_my0EIwfgpkyBJ77AXbZnYAuWrCw";
    String cursor = "";

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
 
    @GetMapping("/board/items/{boardId}")
    public ItemsDTO getItems(@PathVariable String boardId) {
        
        WebClient.Builder builder = WebClient.builder();
        log.info("Board id: " + boardId);
        
        String url = "https://api.miro.com/v2/boards/" + boardId + "/items?limit=10&cursor=" + cursor;
        log.info("URL: " + url);

        ItemsDTO items = builder.build()
            .get()
            .uri(url)
            .header("accept", "application/json")
            .header("authorization", "Bearer " + accessToken)
            .retrieve()
            .bodyToMono(ItemsDTO.class)
            .block();
        
        for(ItemDTO item : items.getData()){
            log.info("Item: " + item);
        }
        
        if(items.getCursor() == null){
            cursor = "";
        }else{
            cursor = items.getCursor();
        }

        return items;
    }

}