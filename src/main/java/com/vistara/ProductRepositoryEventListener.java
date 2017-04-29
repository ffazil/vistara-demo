package com.vistara;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

/**
 * @author firoz
 * @since 29/04/17
 */
@Slf4j
@Component
@RepositoryEventHandler
public class ProductRepositoryEventListener {

    @HandleBeforeCreate
    public void apply(Product product){
        if(product.getName().equals("coffee"))
            product.setDescription("Coffee rocks");
    }
}
