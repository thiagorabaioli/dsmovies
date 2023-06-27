package tfr.dsmovies;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tfr.dsmovies.entities.User;
import tfr.dsmovies.repositories.UserRepository;

@SpringBootApplication
public class DsmoviesApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(DsmoviesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null, "sssss@gg.com");
		
		userRepo.saveAll(Arrays.asList(user1));
		
	}
	
	

}
