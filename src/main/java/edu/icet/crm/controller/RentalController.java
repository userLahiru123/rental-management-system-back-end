package edu.icet.crm.controller;

import edu.icet.crm.model.Item;
import edu.icet.crm.model.Rental;
import edu.icet.crm.service.ItemService;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rental")
@CrossOrigin
@RequiredArgsConstructor
public class RentalController {

    private final RentalService rentalService;

    @PostMapping()
    Rental persist(@RequestBody Rental rental){
        return rentalService.persist(rental);
    }

    @GetMapping("/{id}")
    Rental getRental(@PathVariable long id){
        return rentalService.get(id);
    }

    @DeleteMapping("/rental-delete-by-id/{id}")
    boolean deleteRentalById(@PathVariable Long id){
        return rentalService.deleteById(id);
    }

    @PatchMapping("/update-rental-by-id/")
    Rental updateRentalById(@RequestBody Rental rental){
        return rentalService.updateById(rental);
    }

}
