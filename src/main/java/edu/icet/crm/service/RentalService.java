package edu.icet.crm.service;

import edu.icet.crm.model.Item;
import edu.icet.crm.model.Rental;

public interface RentalService {

    Rental persist(Rental rental);

    Rental get(long id);

    boolean deleteById(Long id);

    Rental updateById(Rental rental);
}
