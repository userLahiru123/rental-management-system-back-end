package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.RentalDetailsEntity;
import edu.icet.crm.entity.RentalEntity;
import edu.icet.crm.model.Rental;
import edu.icet.crm.model.RentalDetails;
import edu.icet.crm.repository.RentalDetailsRepository;
import edu.icet.crm.repository.RentalRepository;
import edu.icet.crm.service.RentalDetailsService;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RentalDetailsServiceImpl implements RentalDetailsService {

    private final RentalDetailsRepository rentalRepository;
    private final ObjectMapper mapper;

    @Override
    public RentalDetails updateById(RentalDetails rental) {
        RentalDetailsEntity save = rentalRepository.save(mapper.convertValue(rental, RentalDetailsEntity.class));
        return mapper.convertValue(save,RentalDetails.class);
    }

    @Override
    public RentalDetails persist(RentalDetails rental) {
        RentalDetailsEntity save = rentalRepository.save(mapper.convertValue(rental, RentalDetailsEntity.class));
        return mapper.convertValue(save, RentalDetails.class);
    }

    @Override
    public RentalDetails get(long id) {
        if(rentalRepository.existsById(id)){
            Optional<RentalDetailsEntity> byId = rentalRepository.findById(id);
            return mapper.convertValue(byId.get(), RentalDetails.class);
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
