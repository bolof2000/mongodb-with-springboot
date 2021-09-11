package com.micromongodb;

import io.micrometer.core.instrument.Meter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {



}
