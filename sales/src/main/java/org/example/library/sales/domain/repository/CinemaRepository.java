package org.example.library.sales.domain.repository;

import org.example.library.sales.domain.models.Cinema;
import org.example.library.sales.domain.models.Cinema;
import org.example.library.sales.domain.models.CinemaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, CinemaId> {
}
