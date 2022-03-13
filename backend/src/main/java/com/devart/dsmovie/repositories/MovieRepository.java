package com.devart.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devart.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	

}
