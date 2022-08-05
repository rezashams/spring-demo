package com.example.springdemo.mapper;

import com.example.springdemo.dto.ProductDto;
import com.example.springdemo.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public  interface ProductMapper {
    @Mappings({

            @Mapping(target = "id", source = "id"),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "condition", source = "condition"),
            @Mapping(target = "price", source = "price"),
    })
    public  Product map(ProductDto productDto);
    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "condition", source = "condition"),
            @Mapping(target = "price", source = "price")
    })
    public  ProductDto mapToDto(Product product);


}
