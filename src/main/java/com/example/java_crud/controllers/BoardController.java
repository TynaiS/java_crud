package com.example.java_crud.controllers;

import main.java.com.java_crud.entities.Board;
import main.java.com.java_crud.services.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/board")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public List<Board> listBoards() {
        return boardService.getALlBoards();
    }

    @PostMapping
    public void createBoard(@RequestBody Board board) {
        System.out.println("test");
        boardService.createBoard(board);
    }
}
