package org.example.library.sales.services.impl;

import lombok.AllArgsConstructor;
import org.example.library.sales.domain.models.Movie;
import org.example.library.sales.domain.models.MovieId;
import org.example.library.sales.domain.repository.MovieRepository;
import org.example.library.sales.services.MovieService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public Movie findById(MovieId id) {
        return this.movieRepository.findById(id).orElse(null);
    }

    @Override
    public List<Movie> getAll() {
        return this.movieRepository.findAll();
    }

    @Override
    public Movie createBook(Movie book) {
        return this.movieRepository.save(book);
    }

    @Override
    public Movie updateBook(Movie book) {
        return this.movieRepository.save(book);
    }

    @Override
    public boolean deleteBook(MovieId id) {
        return this.movieRepository.findById(id)
                .map(book -> {
                    this.movieRepository.delete(book);
                    return true;
                })
                .orElse(false);
    }
}
