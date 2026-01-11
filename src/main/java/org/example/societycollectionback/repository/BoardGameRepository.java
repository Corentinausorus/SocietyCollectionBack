package org.example.societycollectionback.repository;

import org.example.societycollectionback.entity.BoardGame;
import org.springframework.data.repository.CrudRepository;

public interface BoardGameRepository extends CrudRepository<BoardGame, Long> {
}
