package edu.icet.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CustomerEntity {

    @Id
    Long customerId;
    String name;
    String city;
    String contactNumber;

}
