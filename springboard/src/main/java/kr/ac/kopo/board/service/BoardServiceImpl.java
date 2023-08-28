package kr.ac.kopo.board.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.vo.BoardVO;
import kr.ac.kopo.reply.vo.ReplyVO;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO boardDAO;

    @Override
    public List<BoardVO> getAllBoard() {
        // BoardDAO한테 일을 시킴. data 가져와.
        // 가공함
        List<BoardVO> boardlist = boardDAO.getAllPost();
        return boardlist;
    }

    @Override
    public BoardVO getPostbyNo(int no) {
        return boardDAO.getPostbyNo(no);
    }

    @Override
    public void writePost(BoardVO boardVO) {
        boardDAO.writeNewPost(boardVO);
    }

}
