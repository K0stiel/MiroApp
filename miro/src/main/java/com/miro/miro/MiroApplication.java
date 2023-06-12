package com.miro.miro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiroApplication.class, args);
	}

}
/*
 spring 
1 - развернуть проект
1) spring web mvc
2) gradle
3) java 17
4) spring data

1 неделя

https://developers.miro.com/reference/api-reference

1) создать приложение
2) разобраться в рест апи миро
3) сделать получение списка карточке из заданной доски
(токен получить самому)


api
@GetMapping("/board/items/{boardId}")
public List<ItemDTO> getItems(@PathVariable String boardId) {

дто айтема:

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
 */