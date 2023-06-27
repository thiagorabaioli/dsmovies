package tfr.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfr.dsmovies.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
