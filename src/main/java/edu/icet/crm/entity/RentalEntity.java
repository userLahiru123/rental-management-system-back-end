package edu.icet.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class RentalEntity {

    @Id
    Long rentalId;
    String rentalDate;
    String returnDate;
    String dueDate;
    String totalCost;

}
