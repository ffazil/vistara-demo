package com.vistara;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * @author firoz
 * @since 29/04/17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity
public class Product extends AbstractAggregateRoot{

    private String name;
    private String description;
}
