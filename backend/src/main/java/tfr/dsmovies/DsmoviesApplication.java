package tfr.dsmovies;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tfr.dsmovies.entities.User;
import tfr.dsmovies.repositories.UserRepository;

@SpringBootApplication
public class DsmoviesApplication {
	
	@Autowired
	private UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(DsmoviesApplication.class, args);
	}

	
	
	

}
