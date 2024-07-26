package edu.icet.crm.service;

import edu.icet.crm.model.Rental;
import edu.icet.crm.model.RentalDetails;

public interface RentalDetailsService {

    RentalDetails persist(RentalDetails rentalDetails);

    RentalDetails get(long id);

    boolean deleteById(Long id);

    RentalDetails updateById(RentalDetails rentalDetails);
}
