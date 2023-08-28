package kr.ac.kopo.board.service;

import java.util.List;
import kr.ac.kopo.board.vo.BoardVO;
import kr.ac.kopo.reply.vo.ReplyVO;

public interface BoardService {
    List<BoardVO> getAllBoard();

    BoardVO getPostbyNo(int no);

    void writePost(BoardVO boardVO);
}
