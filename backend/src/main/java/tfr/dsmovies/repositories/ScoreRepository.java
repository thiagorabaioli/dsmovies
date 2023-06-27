package tfr.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import tfr.dsmovies.entities.Movie;
import tfr.dsmovies.entities.Score;
import tfr.dsmovies.entities.ScorePK;



@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
