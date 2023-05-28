package org.example.library.sales.domain.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import org.example.library.sharedkernel.base.AbstractEntity;
import org.example.library.sharedkernel.financial.Money;

@Entity
@Getter
public class CinemaStore extends AbstractEntity<MovieId> {
    private int quantity;
    private Money price;
}
