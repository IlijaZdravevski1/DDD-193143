package org.example.library.sales.services.impl;

import lombok.AllArgsConstructor;
import org.example.library.sales.domain.models.Cinema;
import org.example.library.sales.domain.models.CinemaId;
import org.example.library.sales.domain.repository.CinemaRepository;
import org.example.library.sales.services.CinemaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CinemaServiceImpl implements CinemaService {

    private final CinemaRepository cinemaRepository;

    @Override
    public Cinema findById(CinemaId id) {
        return this.cinemaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cinema> getAll() {
        return this.cinemaRepository.findAll();
    }

    @Override
    public Cinema createCinema(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    @Override
    public Cinema updateCinema(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    @Override
    public boolean deleteCinema(CinemaId id) {
        return this.cinemaRepository.findById(id)
                .map(book -> {
                    this.cinemaRepository.delete(book);
                    return true;
                })
                .orElse(false);
    }
}
