package org.seongsu.stockproject.Repository;

import org.apache.ibatis.annotations.Mapper;
import org.seongsu.stockproject.DTO.BoardDTO;

import java.util.List;

@Mapper
public interface BoardRepository {
    BoardDTO selectArticle(Long id);
    BoardDTO insertArticle(BoardDTO article);
    BoardDTO updateArticle(BoardDTO article);
    void deleteArticle(Long id);
    List<BoardDTO> selectAllArticles();
}
