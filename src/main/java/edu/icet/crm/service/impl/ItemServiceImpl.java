package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.ItemEntity;
import edu.icet.crm.exception.ItemNotFoundException;
import edu.icet.crm.model.Item;
import edu.icet.crm.repository.ItemRepository;
import edu.icet.crm.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ObjectMapper mapper;

    @Override
    public Item updateItemById(Item item) {
        ItemEntity save = itemRepository.save(mapper.convertValue(item, ItemEntity.class));
        return mapper.convertValue(save,Item.class);
    }

    @Override
    public Item persist(Item item) {
        ItemEntity save = itemRepository.save(mapper.convertValue(item, ItemEntity.class));
        return mapper.convertValue(save, Item.class);
    }

    @Override
    public Item getItem(long id) {
        Optional<ItemEntity> byId = itemRepository.findById(id);
        if(byId.isPresent()){
            return mapper.convertValue(byId.get(), Item.class);
        }else {
            throw new ItemNotFoundException("Item Not Found");
        }
    }

    @Override
    public void deleteItemById(Long id) {
        itemRepository.deleteById(id);
    }
}
