package com.example.Movies_assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movies_assignment.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
