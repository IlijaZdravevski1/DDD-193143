package org.example.library.sales.services;

import org.example.library.sales.domain.models.Cinema;
import org.example.library.sales.domain.models.CinemaId;

import java.util.List;

public interface CinemaService {
    Cinema findById(CinemaId id);
    List<Cinema> getAll();
    Cinema createCinema(Cinema cinema);
    Cinema updateCinema(Cinema cinema);
    boolean deleteCinema(CinemaId id);
}
