package org.seongsu.stockproject.Repository;

import org.apache.ibatis.annotations.Mapper;
import org.seongsu.stockproject.DTO.BoardDTO;

import java.util.List;

@Mapper
public interface BoardRepository {
    BoardDTO selectArticle(Long id);
    void insertArticle(BoardDTO article);
    void updateArticle(BoardDTO article);
    void deleteArticle(Long id);
    List<BoardDTO> selectAllArticles();
}
