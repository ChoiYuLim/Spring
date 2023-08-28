package kr.ac.kopo.reply.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.reply.dao.ReplyDAO;
import kr.ac.kopo.reply.vo.ReplyVO;

@Service
public class ReplyService {
    @Autowired
    private ReplyDAO replyDAO;

    @Autowired
    private BoardDAO boardDAO;

    public void insertReply(ReplyVO replyVO) {
        // 1. 댓글 수 1 증가 - t_board, board_no 받아서 count+1
        boardDAO.increseCount(replyVO.getBoardNo());

        // 2. reply insert = t_reply
        replyDAO.insertReply(replyVO);
    }

    public List<ReplyVO> getReplybyBoardNo(int bno) {
        List<ReplyVO> replylist = replyDAO.getReplybyBoardNo(bno);
        return replylist;
    }

    public void deleteReplyByNo(int replyNo) {
        replyDAO.deleteReplyByNo(replyNo);
    }

}
