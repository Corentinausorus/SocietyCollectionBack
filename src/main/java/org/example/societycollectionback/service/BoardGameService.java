package org.example.societycollectionback.service;

import org.example.societycollectionback.entity.BoardGame;
import org.example.societycollectionback.repository.BoardGameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardGameService {

    private final BoardGameRepository boardGameRepository;

    public BoardGameService(BoardGameRepository boardGameRepository) {
        this.boardGameRepository = boardGameRepository;
    }

    public List<BoardGame> findAll() {
        return (List<BoardGame>) boardGameRepository.findAll();
    }
}
