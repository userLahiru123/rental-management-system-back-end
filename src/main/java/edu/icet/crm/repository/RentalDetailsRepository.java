package edu.icet.crm.repository;

import edu.icet.crm.entity.RentalDetailsEntity;
import edu.icet.crm.entity.RentalEntity;
import org.springframework.data.repository.CrudRepository;

public interface RentalDetailsRepository extends CrudRepository<RentalDetailsEntity,Long> {
}
