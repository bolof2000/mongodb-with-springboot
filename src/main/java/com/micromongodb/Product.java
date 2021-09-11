package com.micromongodb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.bson.codecs.BigDecimalCodec;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "products")
public class Product {

    @Transient
    private static final String SEQUENCE_NAME ="products_sequence";

    @Id
    private String id;
    private String name;
    private String modelNumberl;
    private String brand;
    private String url;

    @Field("imageUrl")
    private String image;
    private BigDecimal price;
}
