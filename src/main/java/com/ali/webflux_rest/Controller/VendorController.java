package com.ali.webflux_rest.Controller;

import com.ali.webflux_rest.Model.Vendor;
import com.ali.webflux_rest.Repository.VendorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class VendorController {

    @RestController
    public class CategoryController {

        private final VendorRepository vendorRepository;

        public CategoryController(VendorRepository vendorRepository) {
            this.vendorRepository = vendorRepository;
        }

        @GetMapping("/api/v1/vendors")
        Flux<Vendor> list() {
            return vendorRepository.findAll();
        }

        @GetMapping("/api/v1/vendors{id}")
        Mono<Vendor> getById(@PathVariable String id) {
            return vendorRepository.findById(id);
        }
    }
}
