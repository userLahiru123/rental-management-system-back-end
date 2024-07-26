package edu.icet.crm.model;

import lombok.Data;

@Data
public class Customer {

    Long customerId;
    String name;
    String city;
    String contactNumber;

}
