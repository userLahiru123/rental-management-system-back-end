package edu.icet.crm.service;

import edu.icet.crm.model.Item;

public interface ItemService {

    Item persist(Item item);

    Item getItem(long id);
}