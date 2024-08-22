package com.micropractice.menuservice.menuservice.controller;

import com.micropractice.menuservice.menuservice.model.Item;
import com.micropractice.menuservice.menuservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/restaurant")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> getAll(){
        return itemService.getItems();
    }

    @PostMapping
    public Item saveOrUpdate (@RequestBody Item item){
        return itemService.saveOrUpdate(item);
    }

    @GetMapping("/{itemId}")
    public Optional<Item> getById (@PathVariable("itemId") Long id){
       return itemService.getItemById(id);
    }

    @DeleteMapping("/{itemId}")
    public void delete (@PathVariable("itemId") Long id){
        itemService.deletetemById(id);
    }
}
