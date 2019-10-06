package ar.com.batalla.naval.repository;

import ar.com.batalla.naval.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game,Long> {

}
