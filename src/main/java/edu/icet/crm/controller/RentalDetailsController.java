package edu.icet.crm.controller;

import edu.icet.crm.model.Rental;
import edu.icet.crm.model.RentalDetails;
import edu.icet.crm.service.RentalDetailsService;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rental-details")
@CrossOrigin
@RequiredArgsConstructor
public class RentalDetailsController {

    private final RentalDetailsService rentalService;

    @PostMapping()
    RentalDetails persist(@RequestBody RentalDetails rental){
        return rentalService.persist(rental);
    }

    @GetMapping("/{id}")
    RentalDetails getRental(@PathVariable long id){
        return rentalService.get(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    boolean deleteRentalById(@PathVariable Long id){
        return rentalService.deleteById(id);
    }

    @PatchMapping("/update-by-id/")
    RentalDetails updateRentalById(@RequestBody RentalDetails rental){
        return rentalService.updateById(rental);
    }

}
