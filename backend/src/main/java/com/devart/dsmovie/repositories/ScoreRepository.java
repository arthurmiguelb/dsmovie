package com.devart.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devart.dsmovie.entities.Score;
import com.devart.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	

}
