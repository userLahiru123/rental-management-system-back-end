package edu.icet.crm.model;

import lombok.Data;

@Data
public class Item {

    Long itemId;
    String name;
    String rentPerDate;
    String finePerDate;
    String availability;

}
