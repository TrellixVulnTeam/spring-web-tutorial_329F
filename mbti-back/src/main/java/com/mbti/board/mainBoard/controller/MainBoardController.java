package com.mbti.board.mainBoard.controller;

import com.mbti.board.mainBoard.entity.MainBoard;
import com.mbti.board.mainBoard.service.MainBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class MainBoardController {

    @Autowired
    private MainBoardService mainBoardSerivce;

    @GetMapping
    public List<MainBoard> retrieveMainBoardAll(){
        return mainBoardSerivce.retrieveMainBoardAll();
    }

    @GetMapping("/detail")
    public MainBoard retrieveMainBoard(int mainBoardNum){
        return mainBoardSerivce.retrieveMainBoard(mainBoardNum);
    }

    @PostMapping
    public int createMainBoardContent(@RequestBody MainBoard mainBoard){
        return mainBoardSerivce.createMainBoardContent(mainBoard);
    }

    @PutMapping
    public int updateMainBoardContent(@RequestBody MainBoard mainBoard){
        return mainBoardSerivce.updateMainBoardContent(mainBoard);
    }

    @DeleteMapping
    public int deleteMainBoardContent(int mainBoardNum){
        return mainBoardSerivce.deleteMainBoardContent(mainBoardNum);
    }

}
