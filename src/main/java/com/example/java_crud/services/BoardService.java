package com.example.java_crud.services;

import main.java.com.java_crud.entities.Board;
import main.java.com.java_crud.repositories.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }
    public List<Board> getALlBoards() {
        return boardRepository.findAll();
    }

    public void createBoard(Board board) {
        System.out.println("success");
        boardRepository.save(board);
    }
}
