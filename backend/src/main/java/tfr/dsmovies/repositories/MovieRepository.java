package tfr.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import tfr.dsmovies.entities.Movie;



@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
