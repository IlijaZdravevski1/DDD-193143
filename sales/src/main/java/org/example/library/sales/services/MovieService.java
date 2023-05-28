package org.example.library.sales.services;

import org.example.library.sales.domain.models.Movie;
import org.example.library.sales.domain.models.MovieId;

import java.util.List;

public interface MovieService {
    Movie findById(MovieId id);
    List<Movie> getAll();
    Movie createBook(Movie book);
    Movie updateBook(Movie book);
    boolean deleteBook(MovieId id);
}
