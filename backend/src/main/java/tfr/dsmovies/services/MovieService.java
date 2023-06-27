package tfr.dsmovies.services;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tfr.dsmovies.entities.Movie;
import tfr.dsmovies.entities.dto.MovieDTO;
import tfr.dsmovies.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repo;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable){
		Page<Movie> list = repo.findAll(pageable);
		Page<MovieDTO> listDto = list.map(x -> new MovieDTO(x));
		return listDto;
		
	}@Transactional(readOnly = true)
	public MovieDTO findById(Long id){
		Movie obj = repo.findById(id).get();
		MovieDTO objDto =  new MovieDTO(obj);
		return objDto;
		
	}

}
