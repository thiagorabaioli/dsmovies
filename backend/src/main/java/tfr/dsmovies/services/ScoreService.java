package tfr.dsmovies.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tfr.dsmovies.entities.Movie;
import tfr.dsmovies.entities.Score;
import tfr.dsmovies.entities.User;
import tfr.dsmovies.entities.dto.MovieDTO;
import tfr.dsmovies.entities.dto.ScoreDTO;
import tfr.dsmovies.repositories.MovieRepository;
import tfr.dsmovies.repositories.ScoreRepository;
import tfr.dsmovies.repositories.UserRepository;

@Service
public class ScoreService {
	
	@Autowired
	private MovieRepository movieRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ScoreRepository scoreRepo;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		User user = userRepo.findByEmail(dto.getEmail());
		if(user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepo.saveAndFlush(user);
		}
		Movie movie = movieRepo.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		
		score.setValue(dto.getScore());
		
		score = scoreRepo.saveAndFlush(score);
		
		double sum = 0.0;
		for(Score s : movie.getScores()) {
			sum = sum + s.getValue();
		}
		
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepo.save(movie);
		
		return new MovieDTO(movie);
	}
	
	

}
