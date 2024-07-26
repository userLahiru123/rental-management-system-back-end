package edu.icet.crm.repository;

import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.entity.RentalEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity,Long> {
}
