package kr.ac.kopo.board.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping("/board/new")
    public String newPostProcess(@Valid BoardVO boardVO, BindingResult br) { // @Valid는 null 있는지 없는지
                                                                             // 확인하고 br에 결과를 받음
        // data 관련 작업
        // boardService에게 일을 시킴
        // boardVO insert해
        if (br.hasErrors()) {
            System.out.println("null 값이 있습니다.");
            return "board/writeForm"; // view name: /board/boardlist.jsp
            // View-Resolver: WEB-INF/jsp/ board/boardlist .jsp
        } else {
            boardService.writePost(boardVO);
            return "redirect:/board";
            // http://localhost:8080/springboard/board
            // redirect가 있으면 viewName이 아니라, url이구나 생각하고 url로!
        }
    }

    @GetMapping("/board/new")
    public String newPost(Model model) {
        // 만들어서 jsp 보내줌
        BoardVO boardVO = new BoardVO();
        boardVO.setTitle("기본제목");
        model.addAttribute("boardVO", boardVO);
        return "board/writeForm";
        // WEB-INF/jsp/board/writeForm.jsp
    }

    // https://localhost:8080/springboard/board
    @GetMapping("/board")
    public ModelAndView getAllBoard() {
        ModelAndView mav = new ModelAndView("board/boardlist");

        List<BoardVO> boardlist = boardService.getAllBoard();
        mav.addObject("boardlist", boardlist);
        // WEB-INF/jsp/ board/boardlist .jsp
        return mav;
    }

    // https://localhost:8080/springboard/post?no=10
    @GetMapping("/post")
    public String getPostbyNo(@RequestParam("no") int no, Model model) {
        BoardVO boardVO = boardService.getPostbyNo(no);
        model.addAttribute("boardVO", boardVO);
        return "board/detail"; // WEB-INF/jsp/board/detail.jsp
    }

    @GetMapping("/board/{no}")
    public String getPostbyNo2(@PathVariable("no") int no, Model model) {
        BoardVO boardVO = boardService.getPostbyNo(no);
        model.addAttribute("boardVO", boardVO);
        return "board/detail"; // WEB-INF/jsp/board/detail.jsp
    }
}
