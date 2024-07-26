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

    @DeleteMapping("/item-delete-by-id/{id}")
    void deleteItemById(@PathVariable Long id){
        itemService.deleteItemById(id);
    }

    @PatchMapping("/update-item-by-id/")
    Item updateItemById(@RequestBody Item item){
        return itemService.updateItemById(item);
    }

}
