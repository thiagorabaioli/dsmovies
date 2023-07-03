package tfr.dsmovies.controllers;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tfr.dsmovies.entities.dto.MovieDTO;
import tfr.dsmovies.entities.dto.ScoreDTO;
import tfr.dsmovies.services.ScoreService;

@RestController
@RequestMapping(value="/scores", method = RequestMethod.GET)
public class ScoreController {
	

	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}
	
	
	

}
