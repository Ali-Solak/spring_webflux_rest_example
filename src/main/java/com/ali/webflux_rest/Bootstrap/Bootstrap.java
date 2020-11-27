package com.ali.webflux_rest.Bootstrap;


import com.ali.webflux_rest.Model.Category;
import com.ali.webflux_rest.Model.Vendor;
import com.ali.webflux_rest.Repository.CategoryRepository;
import com.ali.webflux_rest.Repository.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {


    private final CategoryRepository categoryRepository;
    private final VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(categoryRepository.count().block() == 0){
            //load data
            System.out.println("#### LOATING DATA ON BOOTSTRAP #####");

            categoryRepository.save(Category.builder()
            .description("Fruits").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Nuts").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Breads").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Meats").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Eggs").build()).block();

            System.out.println("Loaded Categories: " + categoryRepository.count().block());

            vendorRepository.save(Vendor.builder()
            .firstName("Joe")
            .lastName("Mario").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Billy")
                    .lastName("Vanilly").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Gregor")
                    .lastName("Legor").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Franu")
                    .lastName("Lanu").build()).block();

            System.out.println("Loaded Vendors:" + vendorRepository.count().block());
        }

    }
}
