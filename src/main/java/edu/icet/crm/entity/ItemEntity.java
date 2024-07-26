package edu.icet.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ItemEntity {

    @Id
    Long itemId;
    String name;
    String rentPerDate;
    String finePerDate;
    String availability;

}
