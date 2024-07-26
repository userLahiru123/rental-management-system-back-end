package edu.icet.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class RentalDetailsEntity {

    @Id
    Long rentalId;
    String totalItemCost;
    String quantity;

}
