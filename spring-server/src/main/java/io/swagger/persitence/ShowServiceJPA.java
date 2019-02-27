package io.swagger.persitence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.Show;

@Service
public class ShowServiceJPA {
	
	@Autowired
	private ShowRepository showRepository;
	
	public Show findOne(Integer id) {
		return showRepository.findOne(id);
	}
	

	public List<Show> findAll() {
		return showRepository.findAll();
	}
	
	public List<Show> findSome(Integer limit) {
		return showRepository.findAll().subList(0, limit);
	}
}
