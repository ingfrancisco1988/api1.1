package ar.com.batalla.naval.repository;

import ar.com.batalla.naval.model.GamePlayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamePlayerRepository extends JpaRepository<GamePlayer,Long> {
}
