package org.seongsu.stockproject.Service;

import lombok.RequiredArgsConstructor;
import org.seongsu.stockproject.DTO.BoardDTO;
import org.seongsu.stockproject.Repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardDTO getArticle(Long id) {
        return boardRepository.selectArticle(id);
    }

    public void createArticle(BoardDTO article) {
        boardRepository.insertArticle(article);
    }

    public void updateArticle(BoardDTO article) {
        boardRepository.updateArticle(article);
    }

    public void deleteArticle(Long id) {
        boardRepository.deleteArticle(id);
    }

    public List<BoardDTO> getAllArticles() {
        return boardRepository.selectAllArticles();
    }
}
