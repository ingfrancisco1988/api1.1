package ar.com.batalla.naval.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.batalla.naval.model.Score;
import ar.com.batalla.naval.repository.PlayerRepository;
import ar.com.batalla.naval.repository.ScoreRepository;
import ar.com.batalla.naval.service.ScoreService;

@Service
public class ScoreServiceImpl implements ScoreService {
	
	@Autowired
	private ScoreRepository scoreRepository;

	@Override
	public Score findById(Long id) {
		
		return scoreRepository.findById(id).get();
	}

	@Override
	public List<Score> findAll() {
		// TODO Auto-generated method stub
		return scoreRepository.findAll();
	}

	@Override
	public Score save(Score score) {
		// TODO Auto-generated method stub
		return scoreRepository.save(score);
	}

	@Override
	public Score deleteById() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
