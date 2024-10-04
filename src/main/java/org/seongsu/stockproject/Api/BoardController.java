package org.seongsu.stockproject.Api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.seongsu.stockproject.DTO.BoardDTO;
import org.seongsu.stockproject.Service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BoardController {

    private BoardService boardService;

    @PostMapping("/article/create")
    public ResponseEntity<BoardDTO> createArticle(@RequestBody BoardDTO dto){
        BoardDTO article = boardService.createArticle(dto);

        if ( article == null ){
            throw new NoSuchElementException("Article is null");
        }
        return ResponseEntity.status(HttpStatus.OK).body(article);
    }

    @DeleteMapping("/article/delete/{id}")
    public ResponseEntity<BoardDTO> deleteArticle(@PathVariable Long id){
        boardService.deleteArticle(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/articles")
    public ResponseEntity<List<BoardDTO>> getAllArticle(){
        List<BoardDTO> dtos = boardService.getAllArticles();
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }

    @GetMapping("/article/{id}")
    public ResponseEntity<BoardDTO> getArticle(@PathVariable Long id){
        BoardDTO dto = boardService.getArticle(id);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
}
