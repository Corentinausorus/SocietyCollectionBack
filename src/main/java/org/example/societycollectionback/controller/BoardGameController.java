package org.example.societycollectionback.controller;

import org.example.societycollectionback.entity.BoardGame;
import org.example.societycollectionback.service.BoardGameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boardgames")
@CrossOrigin
public class BoardGameController {
    private final BoardGameService boardGameService;

    public BoardGameController(BoardGameService boardGameService) {
        this.boardGameService = boardGameService;
    }

    public List<BoardGame> getAllBoardGames() {
        return boardGameService.findAll();
    }
}
