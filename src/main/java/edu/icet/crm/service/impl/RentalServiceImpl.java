package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.ItemEntity;
import edu.icet.crm.entity.RentalEntity;
import edu.icet.crm.model.Item;
import edu.icet.crm.model.Rental;
import edu.icet.crm.repository.ItemRepository;
import edu.icet.crm.repository.RentalRepository;
import edu.icet.crm.service.ItemService;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {

    private final RentalRepository rentalRepository;
    private final ObjectMapper mapper;

    @Override
    public Rental updateById(Rental rental) {
        RentalEntity save = rentalRepository.save(mapper.convertValue(rental, RentalEntity.class));
        return mapper.convertValue(save,Rental.class);
    }

    @Override
    public Rental persist(Rental rental) {
        RentalEntity save = rentalRepository.save(mapper.convertValue(rental, RentalEntity.class));
        return mapper.convertValue(save, Rental.class);
    }

    @Override
    public Rental get(long id) {
        if(rentalRepository.existsById(id)){
            Optional<RentalEntity> byId = rentalRepository.findById(id);
            return mapper.convertValue(byId.get(), Rental.class);
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
