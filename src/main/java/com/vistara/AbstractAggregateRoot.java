package com.vistara;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.hateoas.Identifiable;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.util.List;
import java.util.UUID;

@MappedSuperclass
public abstract class AbstractAggregateRoot extends org.springframework.data.domain.AbstractAggregateRoot implements Identifiable<String> {
    @Id
    private String id;

    protected AbstractAggregateRoot() {
        this.init();
    }

    @PrePersist
    protected void init() {
        if(this.id == null) {
            this.id = UUID.randomUUID().toString();
        }

    }

    @JsonIgnore
    public List<Object> getDomainEvents() {
       return super.getDomainEvents();

    }

    public String getId() {
        return this.id;
    }
}