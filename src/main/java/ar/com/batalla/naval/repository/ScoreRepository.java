package ar.com.batalla.naval.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.batalla.naval.model.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long>{

}
