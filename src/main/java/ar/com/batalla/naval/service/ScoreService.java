package ar.com.batalla.naval.service;

import java.util.List;

import ar.com.batalla.naval.model.Score;

public interface ScoreService {
	
	public Score findById(Long id);
    public List<Score> findAll();
    public Score save(Score score);
    public Score deleteById();

}
