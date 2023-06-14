package com.miro.miro.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.miro.miro.model.ItemDTO;
import com.miro.miro.model.ItemsDTO;

/*
 * board_id = uXjVM_nWdxc=
 * Refresh token: eyJtaXJvLm9yaWdpbiI6ImV1MDEifQ_h9AEF1Lvwh2UuuEi7utg04OH3NI
 * Access Token: eyJtaXJvLm9yaWdpbiI6ImV1MDEifQ_h4Z424icB_AytvKP9m2iTRLF1ek
 */

@RestController
public class MiroController {
    
    String accessToken = "eyJtaXJvLm9yaWdpbiI6ImV1MDEifQ_GtPpcxQ-fWPMfdjhS3aNfsnfhuA";
    String refreshToken = "eyJtaXJvLm9yaWdpbiI6ImV1MDEifQ_h9AEF1Lvwh2UuuEi7utg04OH3NI";

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

 
    @GetMapping("/board/items/{boardId}")
    public ItemsDTO getItems(@PathVariable String boardId) {
        
        WebClient.Builder builder = WebClient.builder();
        System.out.println(boardId);
        String url = "https://api.miro.com/v2/boards/" + boardId + "/items";
        
        ItemsDTO items = builder.build()
            .get()
            .uri(url)
            .header("accept", "application/json")
            .header("authorization", "Bearer " + accessToken)
            .retrieve()
            .bodyToMono(ItemsDTO.class)
            .block();
        
        System.out.println(items);
        return items;
    }

}