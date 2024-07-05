package com.micropractice.menuservice.menuservice.service;

import com.micropractice.menuservice.menuservice.model.Item;
import com.micropractice.menuservice.menuservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getItems(){
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById (Long id){
        System.out.println(itemRepository.findById(id));
        return itemRepository.findById(id);
    }

    public void saveOrUpdate (Item item){
        itemRepository.save(item);
    }

    public void deletetemById (Long id){
        itemRepository.deleteById(id);
    }
}
