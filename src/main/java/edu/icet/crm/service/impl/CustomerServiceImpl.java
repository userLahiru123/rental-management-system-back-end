package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.entity.RentalEntity;
import edu.icet.crm.model.Customer;
import edu.icet.crm.model.Rental;
import edu.icet.crm.repository.CustomerRepository;
import edu.icet.crm.repository.RentalRepository;
import edu.icet.crm.service.CustomerService;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository rentalRepository;
    private final ObjectMapper mapper;

    @Override
    public Customer updateById(Customer customer) {
        CustomerEntity save = rentalRepository.save(mapper.convertValue(customer, CustomerEntity.class));
        return mapper.convertValue(save,Customer.class);
    }

    @Override
    public Customer persist(Customer customer) {
        CustomerEntity save = rentalRepository.save(mapper.convertValue(customer, CustomerEntity.class));
        return mapper.convertValue(save, Customer.class);
    }

    @Override
    public Customer get(long id) {
        if(rentalRepository.existsById(id)){
            Optional<CustomerEntity> byId = rentalRepository.findById(id);
            return mapper.convertValue(byId.get(), Customer.class);
        }
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        if(rentalRepository.existsById(id)){
            rentalRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
