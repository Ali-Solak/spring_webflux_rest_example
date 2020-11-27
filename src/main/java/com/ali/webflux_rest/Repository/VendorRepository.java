package com.ali.webflux_rest.Repository;


import com.ali.webflux_rest.Model.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
