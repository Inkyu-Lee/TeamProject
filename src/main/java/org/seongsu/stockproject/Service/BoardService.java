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

    public BoardDTO createArticle(BoardDTO article) {
        return boardRepository.insertArticle(article);
    }

    public BoardDTO updateArticle(BoardDTO article) {
        return boardRepository.updateArticle(article);
    }

    public void deleteArticle(Long id) {
        boardRepository.deleteArticle(id);
    }

    public List<BoardDTO> getAllArticles() {
        return boardRepository.selectAllArticles();
    }
}
