package com.ali.webflux_rest.Repository;


import com.ali.webflux_rest.Model.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository <Category, String>{
}
