package edu.icet.crm.service;

import edu.icet.crm.model.Customer;
import edu.icet.crm.model.Rental;

public interface CustomerService {

    Customer persist(Customer customer);

    Customer get(long id);

    boolean deleteById(Long id);

    Customer updateById(Customer customer);
}
