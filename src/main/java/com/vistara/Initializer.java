package com.vistara;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author firoz
 * @since 29/04/17
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class Initializer {

    @NonNull
    private ProductRepository productRepository;

    @EventListener
    public void init(ApplicationReadyEvent event){
        Product product = new Product("Green tea", "Green tea");
        product = productRepository.save(product);

        log.info("Added {}", product.getName());
    }
}
