package edu.icet.crm.model;

import lombok.Data;

@Data
public class Rental {

    Long rentalId;
    String rentalDate;
    String returnDate;
    String dueDate;
    String totalCost;

}
