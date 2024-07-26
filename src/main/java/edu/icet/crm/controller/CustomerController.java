package edu.icet.crm.controller;

import edu.icet.crm.model.Customer;
import edu.icet.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService rentalService;

    @PostMapping()
    Customer persist(@RequestBody Customer rental){
        return rentalService.persist(rental);
    }

    @GetMapping("/{id}")
    Customer getRental(@PathVariable long id){
        return rentalService.get(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    boolean deleteRentalById(@PathVariable Long id){
        return rentalService.deleteById(id);
    }

    @PatchMapping("/update-by-id/")
    Customer updateRentalById(@RequestBody Customer rental){
        return rentalService.updateById(rental);
    }

}
