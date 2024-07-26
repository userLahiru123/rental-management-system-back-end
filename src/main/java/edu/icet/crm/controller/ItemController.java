package edu.icet.crm.controller;

import edu.icet.crm.model.Item;
import edu.icet.crm.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@CrossOrigin
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping()
    Item persist(@RequestBody Item item){
        return itemService.persist(item);
    }

    @GetMapping("/{id}")
    Item getItem(@PathVariable long id){
        return itemService.getItem(id);
    }

}