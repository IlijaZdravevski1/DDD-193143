package org.example.library.sales.domain.repository;

import org.example.library.sales.domain.models.Movie;
import org.example.library.sales.domain.models.MovieId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, MovieId> {
}
